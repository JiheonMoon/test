package ex02_for;

public class Ex02_for {
	/*
	 * for문의 중첩(다중 for문)
	 * for문안에 다른 for문을 사용하는 경우. 코드가 어려워 보일수있으나 작동원리와 같다
	 * for(초기식;조건식;증감식){
	 * 		for(초기식;조건식;증감식){
	 * 			반복할 명령
	 * 		}
	 * }
	 */
	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println();
		for(int i = 1; i < 5; i++) { //행
			for(int j = 1; j < 4; j++) { //열
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		System.out.println();
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		for(int i = 1; i < 4; i++) { //행
			for(int j = 1; j < 5; j++) { //열
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		//01 02 03 04
		//05 06 07 08
		//09 10 11 12
		int count = 0;
		for(int i = 0; i < 3; i++) { //행
			for(int j = 1; j < 5; j++) { //열
				System.out.printf("%02d ", ++count);
			}
			System.out.println();
		}
		System.out.println();
		//A B C D
		//E F G H
		//I J K L
		char ch = 'A';
		for(int i = 0; i < 3; i++) { //행
			for(int j = 1; j < 5; j++) { //열
				System.out.printf("%c ", ch++);
			}
			System.out.println();
		}
	}
}
