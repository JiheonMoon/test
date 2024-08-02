package ex02_control;

import java.util.Scanner;

public class Ex02_break {
	public static void main(String[] args) {
		/*
		 * break는 switch문을 학습할때 case문을 종료할때 사용되었다
		 * break라는 단어의 의미와 동일하게 반복문을 미리 종료할때 사용
		 * 반복문이 진행되는 도중, 특정 조건을 만족해 더이상 반복문을 실행할 필요 없이 종료하려고 할때 사용
		 */
		
		//난수의 생성: Random클래스, math클래스(java.lang 패키지에 있는 클래스)
		//math 클래스가 static으로 정의되어있기 때문
		int magicNumber = (int)(Math.random() * 50) + 1;
		//Random rnd = new Random();
		//int r = rnd.nextInt(50)+1;
		
		Scanner sc = new Scanner(System.in);
		
//		boolean isMatched = false;//이지선다 -> 참,거짓 담아둘 변수
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.print("찾는 숫자를 입력 : ");
//			int guess = sc.nextInt();
//			
//			if(guess == magicNumber) {
//				System.out.println((i + 1) + "번째에 맞췄습니다.");
//				isMatched = true;
//				break;
//				//기타제어문 특징 - 1.기타제어문 바로 아래는 어떤코드도 올수 없음.
//				//2.반복문 안에서만 사용 가능
//			} else if(guess > magicNumber) {
//				System.out.println("Down!");
//			} else {
//				System.out.println("Up!");
//			}
//		}
//		//정답을 못맞춘 경우 "정답을 맞추지 못했습니다." 출력
//		if(!isMatched) {
//			System.out.println("정답을 맞추지 못했습니다.");
//		}
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j<=5; j++) {
				if( j % 2 == 0) {
					break; //3.다중 반복문에서의 기타제어문을 갖고있는 반복문안에서만 적용
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		//라벨을 이용하면 내가 원하는 반복문에 적용시킬수 있다.
		happy : for(int i = 1; i <= 3; i++) {
			for(int j = 1; j<=5; j++) {
				if( j % 2 == 0) {
					break happy;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
