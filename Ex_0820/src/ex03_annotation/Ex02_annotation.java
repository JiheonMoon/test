package ex03_annotation;

import java.lang.annotation.Annotation;

@TestInfo(value = "테스트 정보")
//value = 를 통해 TestInfo의 value 메서드에 정보가 저장됨
public class Ex02_annotation {
	public static void main(String[] args) {
		Annotation[] annos = Ex02_annotation.class.getAnnotations();
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		//.class 클래스 리터럴
		//그 클래스 자체에 대한 정보를 얻을 수 있다.
		//클래스의 이름, 메서드, 적용된 어노테이션 등
		TestInfo testInfo = (TestInfo)Ex02_annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.value());
		
	}
}
