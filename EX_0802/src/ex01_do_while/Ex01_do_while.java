package ex01_do_while;

public class Ex01_do_while {
	public static void main(String[] args) {
		/*
		 * do while문
		 * while문과 같이 조건을 만족할동한 계속 반복
		 * 다만 while문과 다른점은 무조건 루프를 한번은 실행한후 조건을 검사한다
		 * 조건식의 결과와는 상관없이 무조건 한번은 실행
		 * do{
		 * 	반복하고자 하는 명령
		 * } while(조건식);
		 */
		int i = 11;
		do {
			System.out.println(i);
		}while(i <= 10);
		
		int sum = 0;
		int n = 1;
		do {
			sum += n;
			n++;
		}while(n <= 10);
		
		System.out.println("합 : " + sum);
		//상황에 따라 반복문 사용하기
		//반복횟수가 지정되는 경우 -> 횟수를 만족할때까지 반복 -> for문
		//특정 조건이 부여되는 경우 ->조건이 만족될때까지 반복 -> while문
		//특정 조건과 옵션이 부여되는 경우 -> 한번 실행한 후 반복여부 판단 -> do-while문
	}
}
