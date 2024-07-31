package ex04_if;

import java.util.Scanner;

public class Ex02_if_else {
	/*
	 * if-else문
	 * if문을 사용하면 조건이 true일때만 흐름을 제어할수 있음
	 * 조건이 거짓일때도 제어하기 위해서는 if-else문 사용
	 *if(조건식){
	 * 		조건식이 참일때 실행할 문장;
	 * } else{ else에는 조건이 붙지 않음
	 * 	조건식이 거짓일때 실행할 명령
	 * }
	 */
	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println("num은 4보다 큽니다.");
		} else {
			System.out.println("num은 4보다 작습니다.");
		}
		
		//두개의 숫자 비교하기
		int a = 4;
		int b = 10;
		if(a > b) {
			System.out.println("a가 b보다 큽니다");
		} else {
			if(a == b) {
				System.out.println("a와 b는 같습니다");
			} else {
				System.out.println("a가 b보다 작습니다");
			}
		}
		
		System.out.println("----------------------------");
		//int형 변수가 x가 10보다 크고 20보다 작을때 true인 조건식
		int x = 15;
		if(x > 10 && x < 20) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		//char형 ch가 'x' 또는 'X'일때 true인 조건식
		char ch = 'x';
		if(ch == 'x' || ch =='X') {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		//char형 변수 ch2가 알파벳(대문자 or 소문자)일때 true인 조건식
		char ch2 = '!';
		if(ch2 >= 'A' && ch2 <= 'Z') {
			System.out.println(true);
		}
		else {
			if(ch2 >= 'a' && ch2 <= 'z') {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
		
		//X개의 농구공을 담기 위한 박스의 개수 구하기를 조건문으로 만들기
		System.out.print("공의 개수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int box = 0;
		if(X % 5 == 0) {
			box = X / 5;
		} else {
			box = X / 5 + 1;
		}
		System.out.printf("박스의 개수는 %d개 입니다",box);
	}
}
