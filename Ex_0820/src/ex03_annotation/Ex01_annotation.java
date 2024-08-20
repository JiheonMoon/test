package ex03_annotation;
/*
 * 어노테이션
 * 프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킴
 * 어노테이션은 주석 comment 처럼 프로그래밍 언어에 영향을 미치치 않으면서도 다른 프로그램에게 유용한 정보를 제공할수 있다는 장점이 있음
 * 어노테이션의 뜻은 주석 주해 메모.
 * 
 * 표준 어노테이션
 * 자바에서 제공하는 기본 어노테이션
 * 
 * 메타 어노테이션
 * 어노테이션을 만들기 위한 어노테이션
 * 스프링에선 어노테이션으로 많이 통제를 한다
 * java.lang.anootation 패키지에 정의 되어있
 * 
 * @Target(ElementType.TYPE) - 클래스의 어떤 요소에나 적용가능(기본값)
 * @Target(ElementType.FIELD) 특정 필드에 적용
 * @Target(ElementType.METHOD) 특정 메서드에만 적용
 * @Target(ElementType.PARAMETER) 메서드의 매개변수
 * @Target(ElementType.CONSTRUCTOR) 생성자
 * 
 * @Retention 어노테이션이 유지되는 기간을 지정하는데 사용
 * 
 * @Retention(SOURCE) 소스코드에만 이용이 가능하며 컴파일 후 사라짐
 * @Retention(CLASS) 어노테이션이 .class파일에 존재하지만 런타임시 사라짐
 * @Retention(RUNTIME) 런타임시 사용 가능 실행시 정보제공
 */
@FunctionalInterface
interface B{
	void mothod();
}

@SuppressWarnings("removal")
class A{
	
	@Deprecated
	public void oldOne() {
		
	}
	
	Integer i = new Integer(10);
}
public class Ex01_annotation {
	public static void main(String[] args) {
		//@Override
		//컴파일러에게 재정의하는 메서드라는 것을 알린다
		
		//@Deprecated 앞으로 사용되지 않을것을 권장하는 대상에게 붙임
		
		//@SuppressWarnings 경고를 무시함
		
		//@FunctionalInterface 함수형 인터페이스
	}
}
