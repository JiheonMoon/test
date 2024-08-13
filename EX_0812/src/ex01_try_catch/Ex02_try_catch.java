package ex01_try_catch;

import java.util.Scanner;

/*
 * 나이를 입력받고 20세 이상은 "성인입니다" 14세 이상은 "청소년입니다." 7세 이상이면 "어린이입니다" 그 이외에는 "아동입니다"
 * 단, 수가 0 이하의 수가 입력되면 InputErrorException을 발생시키고, 입력이 잘못되었습니다. 출력
 */

public class Ex02_try_catch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("당신의 나이들 입력하세요 >> ");
			int age = sc.nextInt();
			
			if(age <= 0) {
				throw new InputErrorException("입력이 잘못되었습니다.");
			}
			
			if(age >= 20) {
				System.out.println("성인입니다");
			} else if(age >= 14) {
				System.out.println("청소년입니다");
			} else if(age >= 7) {
				System.out.println("어린이입니다");
			} else {
				System.out.println("아동입니다.");
			}
			
		} catch (InputErrorException e) {
			System.out.println(e.getMessage());
		}
	}
}
