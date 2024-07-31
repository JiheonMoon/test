package ex04_if;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		/*
		 * 제어문
		 * 일반적으로 프로그램에 포함된 실행문은 순차적으로 실행됨
		 * 하지만 순차적으로만 실행한다면 프로그램이 매우 길어지거나 표현하기 어려운 상황이 발생
		 * 선택개념 구현이 힘듦
		 * 
		 * 조건문
		 * 조건식에 따라서 프로그램의 흐름을 제어할수 있는 문법
		 * 삼항연산자에서 미리 봤듯, 조건식의 true or false라는 결과에 따라서 실행할지 결정
		 * if, switch - 고려해야되는 조건이 적으면 if, 많으면 switch를 사용하는 것이 효율적이지만 개수에 따라 고정적으로 써야하는것은 아님
		 * 단순 if문
		 * 조건문중에서 가장 기본이 되는 명령문
		 * 조건식에는 논리형으로 결과를 확인할수 있는 모든식을 넣을수 있음
		 * if(조건식){
		 * 		조건식이 참일때 실행할 문장;
		 * }
		 * 만약 실행해야되는 명령이 하나면 중괄호 생략 가능 if(조건식) 조건식이 참일때 실행할 문장;
		 * 
		 * 자바에서 간결하고 좋은 코드를 만드는 중괄호와 들여쓰기
		 * 중괄호 블록은 여러개의 명령을 하나로 묶기위해 작성한다
		 * 수행문이 하나일 경우 생략할 수 있지만
		 * 중괄호를 사용하면 가독성이 좋을 뿐 아니라 코드의 해석이 용이하고 버그를 수정하는데 도움이 됨
		 */
		
		int result = 0;
		if(3 > 2) {
			result = 3;
			//int n = 10;
		}
		System.out.println(result); //3
		//System.out.println(n); 에러 발생, 변수의 범위 = 만들어진 중괄호 안쪽
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다.");
		}
	}
}
