package ex02_objcect;

/*
 * 기본 API 클래스
 * 자바에서 제공하는 API 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말하며 라이브러리라고도 부른다.
 * 
 * java.lang 패키지 - 자바의 기본적인 클래스를 담고있는 패키지
 * Object - 자바 클래스의 최상위 클래스
 * System - 시스템의 표준 입력/출력 장치로 부터 데이터를 입력받거나 출력하기 위해 사용
 * String - 문자열을 저장하고 여러가지 정보를 업을때 사용
 * StringBuffer/StringBuilder - 문자열을 저장하고 내부 문자열을 조작할때 사용
 * Math - 수학 관련 함수를 이용할때 사용
 * 
 * Object 클래스
 * 자바에서 생성되는 모든 클래스는 생성될때 상속을 하지 않아도 Object를 자동으로 상속받게 되어있음.
 * 따라서 클래스를 생성하면 Object가 가지고 있는 여러 메서드를 그대로 사용하거나 오버라이드하여 사용할 수 있다.
 * 
 * protected Object clone() 객체 자신을 복사한후 반환
 * boolean equals(Object obj) 다른객체와 자신이 가진 실제값을 비교
 * int hashCode() 객체의 hashCode값을 반환
 * String toString() 객체 자신의 정보를 반환
 */

public class Ex01_equals {
	//equals() - 기본 자료형의 데이터를 동등 비교할때는 '=='를 사용함
	//하지만 객체를 동등비교 하게되면, 객체가 있는 위치를 비교하게 됨
	//객체의 데이터를 비교할때는 equals()메서드를 사용함
	
	public static void main(String[] args) {
		String str1 = "Hello"; //암시적 객체 생성
		String str2 = "Hello";
		String str3 = new String("Hello"); //명시적 객체생성
		
//		//암시적 객체 생성을 할때, 먼저 만들어져 있는게 있으면 같이 참조를 함
//		System.out.println("str1 vs str2 : " + (str1 == str2));
//		
//		str1 = "Bye"; //str2와 같은 주소를 참조하니까 str2도 바뀌는게 맞지 않나?
//		System.out.println("str2 : " + str2); //Hello
//		
//		//불변의 법칙 - 값이 새로 대입되거나 추가로 들어오게 되면, 기존의 메모리를 버리고 새로 할당받음.
		
		System.out.println("str2 vs str3 : " + (str2 == str3));
		
		//각 문자열 변수가 있는 위치의 값을 출력
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("str3 hashCode : " + System.identityHashCode(str3));
		
		//문자열 데이터 비교
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str1 vs str3 : " + str1.equals(str3));
	}
}
