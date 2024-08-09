package ex05_try_catch;
/*
* 예외처리문법 - 예외가 발생했을때, 어떻게 예외를 처리하는지 방법을 보자.
* 
* 예외처리과정
* 1.코드 진행중 예외가 발새앟면 JVM에 알린다
* 2.JVM은 발생한 예외를 분석하여 알맞은 예외클래스를 생성한다
* 3.생성된 예외 객체를 발생한 지점으로 보낸다.
* 4.예외가 발생한 지점에서 처리하지 않으면 프로그램은 비정상 종료된다.
* 
* try-catch 구문
* 예외를 처리하는 가장 기본 문법은 try-catch 문
* 예외가 발생할 가능성이 있는 코드는 try{}영역 안에 작성하고 catch 메서드는 시스템으로부터 넘어오는 예외클래스를 받아서 처리
* 
* try{
* 		예외가 잘생할 가능성이 있는 코드
* }catch(예외 클래스명 e){
* 		예외처리 코드
* }
*/
public class Ex01_try_catch {
	public static void main(String[] args) {
		int result = 0;
		try {
			result = 10/0; //예외가 무조건 발생한다
			System.out.println("나누기 결과 : " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 할 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
