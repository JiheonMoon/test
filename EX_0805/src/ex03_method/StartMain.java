package ex03_method;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Start start = new Start();
		int count = 0;
		while(!start.isOk) {
			count++;
			System.out.print(count + "번째 숫자를 입력하세요 : ");
			start.findNumber(sc.nextInt());
			
		}
		System.out.println(count + "회만에 문제를 맞췄습니다.");
	}
}
