package ex04_Math;
/*
 * Math 클래스
 * 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스로 자바에서는 수학계산이 필요할때 주로 사용함
 * 객체를 선언하지 않고 바로 사용할수 있도록 해당 클래스가 제공하는 모든 메서드는 모두 정적 메서드로 이루어져 있음.
 */


public class Ex01_Math {
	public static void main(String[] args) {
		//올림
		System.out.println("3.51올림 : " + Math.ceil(3.51));
		
		//내림
		System.out.println("13.61내림 : " + Math.floor(13.61));
		
		//반올림
		System.out.println("12.8반올림 : " + Math.round(12.8));
		
		//최대값 구하기
		int maxValue = Math.max(30, 60);
		
		//최소값 구하기
		int minValue = Math.min(40, 70);
		
		System.out.println("30, 60 최대값 : " + maxValue);
		System.out.println("40, 70 최소값 : " + minValue);
		
		//소수점 둘째 자리 이하에서 반올림하고 싶을때
		double pi = 3.14159265358979;
		System.out.println(Math.round(pi * 100)/100.0);
		System.out.println(Math.round(pi * 1000)/1000.0);
	}
}
