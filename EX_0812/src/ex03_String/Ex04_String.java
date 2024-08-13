package ex03_String;

import java.util.Scanner;

public class Ex04_String {
	public static void main(String[] args) {
		//(-포함)주민번호를 키보드에서 입력받는다.
		//예시)911223-1234567
		//당신은 1999년 11월 22일에 태어난 남자입니다
		//형식을 잘못 입력한 경우 "주민번호를 올바르게 입력하세요"라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		String id = sc.next();
		int year;
		String month;
		String day;
		
		try {
			if(id.length() != 14) {
				throw new Exception();
			}
			if(id.charAt(6) != '-') {
				throw new Exception();
			}
			if(id.charAt(7)< 1 && id.charAt(7) > 4) {
				throw new Exception();
			}
			
			year = Integer.parseInt(id.substring(0, 2));
			if(year >= 24) {
				year += 1900;
			}else {
				year += 2000;
			}
			month = id.substring(2, 4);
			day = id.substring(4, 6);
			
			System.out.printf("당신은 %d년 %s월 %s일에 태어난 ",year,month,day);
			
			if(id.charAt(7) % 2 == 1) {
				System.out.println("남자입니다.");
			} else {
				System.out.println("여자입니다.");
			}
			
		} catch (Exception e) {
			System.out.println("주민번호를 올바르게 입력하세요");
		}
	}
}
