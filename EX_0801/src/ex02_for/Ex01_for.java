package ex02_for;

import java.util.Scanner;

public class Ex01_for {
	/*
	 * 반복문
	 * 특정수행문을 원하는 만큼 반복하여 실행하는 제어문 for, while
	 * for문
	 * 주로 반복횟수가 정해져있을때 사용하는 문법
	 * for(초기식;조건식;증감식){
	 * 		반복하고싶은 명령
	 * 		명령은 여러개 일수 있음. ex)산술연산,대입,출력,비교 등등
	 * }
	 * 초기식:반복을 하기위한 시작값으로 변수를 하나 초기화
	 * 조건식:반복을 하기위한 종료값으로 비교연산자를 많이 사용한다
	 * 증감식:초기식의 변수의 값을 증감시켜주는 역할(증감연산자를 많이 사용함)
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		//1 2 3 4 5 6 7 8 9 10
		for(int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------------------");
		//10 9 8 7 6 5 4 3 2 1
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		//20이하의 홀수
		for(int i = 1; i < 21; i++) {
			if(i % 2 == 1) 
				System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i < 21; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		//1부터 10까지 3의 배수만 출력
		for(int i = 1; i < 11; i++) {
			if(i % 3 == 0) 
				System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 3; i < 11; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------------------");
		//1부터 10까지의 총합 구하기, 총합은 한번만 출력
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("총합 : " + sum);
		System.out.println("--------------------------");
		//정수형 변수 dan에 2~9 사이의 값으로 초기화하고 해당 dan에 해당하는 구구단 출력하기
		int dan = 3;
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		System.out.println("--------------------------");
		//키보드에서 정수를 하나 입력받아 1부터 입력받은 수까지의 총합 구하기
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("총합 : " + sum);
//		System.out.println("--------------------------");
//		int even = 0;
//		//10개의 정수를 입력받아 그 중에 짝수가 몇개인지 개수를 출력하세요
//		for(int i = 0; i < 10; i++) {
//			System.out.print("정수를 입력하세요 : ");
//			int n = sc.nextInt();
//			if(n % 2 == 0) {
//				even++;
//			}
//		}
//		System.out.println("짝수의 개수는 " + even + "개 입니다.");
		System.out.println("--------------------------");
		//키보드로 부터 정수 2개 입력받음. 입력받은 x부터 y까지의 총합을 출력
		//단 x가 y보다 큰경우 값을 바꿔서 총합을 구함
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int y = sc.nextInt();
		if(x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 총합 : %d", x, y, sum);
	}
	
	
	
}
