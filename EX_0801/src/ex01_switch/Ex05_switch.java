package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		//10이하의 숫자를 키보드에서 입력받음
		//해당 숫자가 짝수인지 홀수인지 판별하여 출력하는 코드를 switch로
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10이하의 정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1,3,5,7,9 -> System.out.println("홀수 입니다");
		case 2,4,6,8,10 -> System.out.println("짝수 입니다");
		default -> System.out.println("잘못된 입력입니다");
		}
		switch(num%2) {
		case 0 -> System.out.println("짝수 입니다");
		case 1 -> System.out.println("홀수 입니다");
		default -> System.out.println("잘못된 입력입니다");
		}

		/*
		 * 키보드에서 month를 입력받아 해당달이 몇일까지 있는지 switch문을 이용해서 작성
		 * X월은 X일까지 있습니다
		 */
		System.out.print("달을 입력해주세요 : ");
		int month = sc.nextInt();
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.printf("%d월은 31일까지 있습니다", month);
		case 4,6,9,11 -> System.out.printf("%d월은 30일까지 있습니다", month);
		case 2 -> System.out.printf("%d월은 28일까지 있습니다", month);
		default -> System.out.println("잘못된 입력입니다.");
		}
		
		System.out.println();
		/*
		 * 계산기 프로그램 만들기
		 * 두개의 정수를 입력받고, 산술연산자또한 입력받아서 문자열에 담는다 "+"
		 * switch문을 이용하여 정수의 연산을 수행하는 코드 작성
		 */
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("산술 연산자 : ");
		String oper = sc.next();
		
		switch(oper) {
		case "+":
			System.out.println(num1+ " + " + num2 + " = " + (num1 + num2));
			break;
		case "-":
			System.out.println(num1+ " - " + num2 + " = " + (num1 - num2));
			break;
		case "*":
			System.out.println(num1+ " * " + num2 + " = " + (num1 * num2));
			break;
		case "/":
			System.out.println(num1+ " / " + num2 + " = " + (num1 / num2)); //숫자 하나를 double로 강제형변환 하면 수학적인 나누기 가능
			break;
		case "%":
			System.out.println(num1+ " % " + num2 + " = " + (num1 % num2));
			break;
		default:
			System.out.println("잘못된 입력입니다.");	
			
		}
	}

}
