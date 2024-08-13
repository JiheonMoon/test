package ex01_generic;
/*
 * Generic 선언 및 생성
 * 제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말함
 * 클래스 또는 인터페이스 이름 뒤에 <> 기호를 추가하고 사이에 식별자 기호를 지정하여 파라미터화 할수 있음.
 * 이것을 마치 메서드가 매개변수를 받아 사용하는 것과 비슷하게 제네릭의 타입 매개변수/ 타입변수라고 부른다.
 * 
 * public class 클래스명<T>{...}
 * public interface 인터페이스명<T>{...}
 * 
 * 타입 파라미터 기호 네이밍
 * 제네릭 기호를 위와같이 T를 써서 표현했지만 사실 식별자 기호는 문법적으로 정해지지 않음
 * 다만 우리가 for문을 이용할때 루프변수를 i로 지정하듯이, 제네릭의 표현 변수를 T로 표현한다.
 * 만일 두번째, 세번째 제네릭이 필요하다면, S,U로 이어나간다.
 * 명명하고 싶은 대로 아무 단어나 넣어도 문제는 없지만, 대중적으로 통상적인 네이밍이 있으면 개발이 용이해지기 때문에 암묵적인 규칙이 존재
 * <T>	타입 type
 * <E>	요소 element
 * <K>	키 Key
 * <V>	값 value
 * <N>	숫자 Number
 */
public class DataListExample {
	public static void main(String[] args) {
		//DataList객체 생성하기 변수명은 list
		//제네릭 타입은 기본 자료형을 인식하지 않음
		//따라서 int, double과 같은 기본자료형을 제네릭타입으로 이용하기 위해서 Integer, Double과 같은 Wrapper 클래스를 이용해야 한다.
		DataList<Integer> list = new DataList<Integer>();
		
		//정수 입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
//		//문자열 저장
//		list.add("문자열");
//		
//		//실수 저장
//		list.add(13.45);
		
		//데이터 출력
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("총합 : " + sum);
	}
}
