package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//스프링에서는 해당클래스를 설정파일로 인식하고 Bean으로 등록
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	//브라우저가 CORS 요청 결과를 캐싱하는데 최대시간 설정
	private final long MAX_AGE_SECS = 3600;

	//WebMvcConfigurer
	//스프링 MVC 동작을 커스터마이징할때 사용
	//스프링을 기본적으로 MVC 동작을 설정해주지만, 때로는 요구사항에 맞게 특정 기능을 추가하거나 수정해야 할때 원하는 설정 적용가능
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		//모든 경로에 대해 CORS 설정을 적용
		registry.addMapping("/**")
		//React 애플리케이션이 실행되는 도메인에서 오는 요청을 허용
		.allowedOrigins("http://localhost:3000")
		//HTTP 메서드를 허용
		.allowedMethods("GET", "POST", "PUT", "DELETE")
		//모든 헤더를 허용
		.allowedHeaders("*")
		//쿠키나 인증정보를 포함한 요청을 허용
		.allowCredentials(true)
		//브라우저가 서버로부터 받은 응답을 일정시간동안 저장해두고, 그 시간내 동일 요청이 있을경우 저장된 응답 재사용
		.maxAge(MAX_AGE_SECS);
	}
	//인터셉터(Interceptors) 추가
	//특정 HTTP 요청이 컨트롤러에 도달하기 전 또는 후에 실행, 요청을 가로채어 로깅, 인증, 권한 확인들의 작업 수행
}
