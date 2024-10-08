package ex04_if;

import java.util.Scanner;

public class Ex04_if_elseif {

	public static void main(String[] args) {
		int favor = 7;
		if(favor > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else if(favor == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}

		/*나이를 키보드에서 입력받음
		 * 20살 이상이면 성인입니다
		 * 14상 이상이면 청소년입니다
		 * 7살 이상이면 어린이입니다
		 * 그 이외에는 유아입니다 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt(); //객체명.메서드명() <- 해당클래스에 있는 메서드 호출
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		} else if(age >= 14) {
			System.out.println("청소년입니다.");
		} else if(age >= 7) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("유아입니다.");
		}
		
		/*키보드에서 성적을 입력받음
		 * 100~90 A
		 * 89~80 B
		 * 79~70 C
		 * 69~60 D
		 * 59~0 F
		 * "점수는 X점이고 성적은 X입니다" 출력
		 */
		
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		char grade = 'a';
		
		if(score > 100 || score < 0) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("점수는 %d점이고, 성적은 %c입니다",score,grade);
	}

}
