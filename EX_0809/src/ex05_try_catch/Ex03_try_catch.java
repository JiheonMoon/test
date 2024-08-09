package ex05_try_catch;

import java.util.Scanner;

//키보드에서 정수를 입력받도록 하고, 이외의 값이 입력되었다면 "정수만 입력 가능" 메시지 출력하기
/*
 * 결과
 * 정수 : 100
 * 결과 : 100
 * 
 * 정수 : aaa
 * 결과 : aaa는(은) 정수가 아닙니다
 */
public class Ex03_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String str = sc.next();
		try {
			int num = Integer.parseInt(str);
			System.out.println("입력받은 수 : " + num);
		} catch (Exception e) {
			System.out.println(str+"는(은) 정수가 아닙니다.");
		}
	}
}
