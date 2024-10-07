package com.example.demo.security;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

//유저의 정보를 받아서 JWT 생성하기
@Service
@Slf4j
public class TokenProvider {
	private static final String SECRET_KEY = "eyJhbGciOiJIUzUxMiJ9eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTcyNzk3NzQ2OSwiaWF0IjoxNzI3OTc3NDY5fQ3WUk1X983GsejnQZJSNQKjZBfBeSzOK4cAxpndz0G3pSItFPDiDVnSfD0ZsQzVCSkSMKQozyMVDjt9VYTcJw";
	
	//토큰생성 메서드
	public String create(UserEntity userEntity) {
		//토큰의 유효날짜를 1일로 정함
		
		//Date.from() Instant 객체를 Date 객체로 변환하는 메서드
		//Instant.now 현재기준의 시간을 날짜와 시간을 초단위로 표현
		//plus(1,ChronoUnit.DAYS) Instant 객체에 하루를 더하는 동작
		Date expiryDate = Date.from(Instant.now().plus(1,ChronoUnit.DAYS));
		/*
		{ // header
		  "alg":"HS512"
		}.
		{ // payload
		  "sub":"~~~~~",
		  "iss": "demo app",
		  "iat":~~~~~,
		  "exp":~~~~~
		}.
		// SECRET_KEY를 이용해 서명한 부분
		XXXXXXXXXXX
		 */
		//JWT 토큰 생성
		return Jwts.builder()
				//header에 들어갈 내용 및 서명을 하기 위한 SECRET_KEY
				.signWith(SignatureAlgorithm.HS512, SECRET_KEY)
				//payload에 들어갈 내용
				.setSubject(userEntity.getId())
				.setIssuer("demo app") //토큰 발행주체
				.setIssuedAt(new Date()) //토큰 발행날짜
				.setExpiration(expiryDate)
				.compact(); //토큰을 .으로 구분된 하나의 문자열로 만들어줌
	}
	public String validateAndGetUserId(String token) {
		Claims claims = Jwts.parser()
							//토큰을 생성할때 사용햇던 서명키
							.setSigningKey(SECRET_KEY)
							//JWT 토큰을 파싱하고 서명을 검증
							//이 메서드는 토큰이 유효한지 검증하고 올바른 서명으로 서명되었는지 검증
							//유효하지 않거나 만료되면 예외발생
							.parseClaimsJws(token)
							//페이로드 부분 반환
							//여기에는 주체, 발행자, 만료시간, 발행시간 등 여러필드가 있을수 있음
							.getBody();
		//getSubject()
		//claims 객체에서 주체를 가져옴
		//주로 사용자의 id나 이름같은 식별자를 나타냄
		//이 값은 JWT를 발급할때 설정된것
		return claims.getSubject();
	}
}
