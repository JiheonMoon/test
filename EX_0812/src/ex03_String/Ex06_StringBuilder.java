package ex03_String;
/*
 * StringBuilder/StringBuffer
 * String 클래스는 최초 지정된 문자열 이후에 값이 추가되면 새로운 메모리를 할당해 새롭게 문자열을 등록한다
 * 문자열을 많이 사용할수록 메모리 사용이 늘어나 메모리가 낭비될수 있다
 * 이런 문제를 해결하기 위해 가변 속성을 지닌 StringBuffer 또는 StringBuilder를 사용한다
 * 내부에 여유공간을 두기 때문에 문자열을 합칠때 메모리에 새롭게 생성하는 과정을 String보다 현저히 생략할수 있다.
 * 
 * append(String str) 기존 문자열 뒤에 더하여 반환
 * delete(int start, int end) 시작위치부터 끝위치 전까지 삭제
 * insert(int offset, String str) 시작위치부터 문자열 삽입
 * reverse() 문자열을 반대로 출력
 */


public class Ex06_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		System.out.println(str);
		
		//기존 문자열 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		
		//문자열 삭제
		str.delete(0, 6);
		System.out.println(str);
		
		//원하는 위치에 문자열 삽입
		str.insert(0, "Hello");
		System.out.println(str);
		
		//문자를 반대로 출력
		str.reverse();
		System.out.println(str);
	}
}
