package ex06_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 예외던지기
 * 메서드 내부에서 예외를 처리하지 않고 미룬후, 해당 메서드를 호출한쪽에서 예외를 처리하는 방법
 * 
 * throws - 메서드 뒤에 throws 키워드를 사용하여 던지기할 예외 객체를 붙여주면 된다
 * 예외객체는 여러개를 던질수 있으며, 여러개 던질시 콤마로 구분하여 나열
 */
public class ThrowsExceptionExample {
	
	public static void CheckYourSelf(Scanner sc) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다. 2.혼자 있는 것이 좋다.");
		System.out.print("선택 : ");
		int check = sc.nextInt();
		if(check == 1) {
			System.out.println("당신은 E");
		} else if(check == 2) {
			System.out.println("당신은 I");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("===성격 유형 검사를 시작합니다===");
			//메서드 호출
			ThrowsExceptionExample.CheckYourSelf(sc);
		} catch (Exception e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		}
	}

}
