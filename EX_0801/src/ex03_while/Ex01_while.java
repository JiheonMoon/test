package ex03_while;

import java.util.Scanner;

public class Ex01_while {
/*
 * while문
 * for문은 보통 정해진 횟수만큼 반복하는 문법
 * while문은 보통은 반복횟수가 정해져 있지 않고 조건식이 true일경우 계속해서 반복하는 문법
 * 주의하지 않으면 무한루프에 빠질수 있음
 * while(조건식){
 * 	조건식이 참일때 반복할 명령
 * }
 */
	public static void main(String[] args) {
		int num = 1; //초기식
		while(num <= 10) {
			System.out.println(num);
			num++; //증감식
			}
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		while(n != -1) {
//			System.out.print("정수 입력 : ");
//			n = sc.nextInt();
//			System.out.println("입력된 정수 : "+n);
//		}
//		//for문으로 만드는 무한루프
//		for(;;) {
//			
//		}
	
		//각 자리수의 합 구하기
		//정수형변수 n이 있을때, 각 자리합을 더한 결과를 출력하세요
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println("자리수의 총 합 : " + sum);
		System.out.println("-----------------------");
		//두개의 주사위를 던졌을때 눈의 합이 6이 되는 경우의 수 출력
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				if( i + j == 6) {
					System.out.println(i + ", " + j);
				}
			}
		}
		System.out.println("-----------------------");
		
		int i = 1;
		while(i<7) {
			int j = 1;
			while(j<7) {
				if( i + j == 6) {
					System.out.println(i + ", " + j);
				}
				j++;
			}
			i++;
		}
		
	}
}
