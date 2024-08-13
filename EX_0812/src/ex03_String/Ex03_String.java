package ex03_String;

import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		//회문 판별하기
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장
		//기러기 토마토 스위스 등등
		//키보드에서 문장을 입력받고 해당 문장이 회문이면 XXX는 회문입니다 XXX는 회문이 아닙니다 라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 : ");
		String str = sc.next();
		
		boolean isReverse = true;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length() -1 -i)) {
				isReverse = false;
			}
		}
		
		if(isReverse) {
			System.out.println(str + "은 회문입니다.");
		}else {
			System.out.println(str + "은 회문이 아닙니다.");
		}
		
		String str2 = "";
		for(int i = str.length() - 1; i > -1; i--) {
			str2 += str.charAt(i);
		}
		
		if(str.equals(str2)) {
			System.out.println(str + "은 회문입니다.");
		}else {
			System.out.println(str + "은 회문이 아닙니다.");
		}
		
	}
}
