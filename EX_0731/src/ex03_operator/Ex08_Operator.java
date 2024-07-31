package ex03_operator;

import java.util.Scanner;

public class Ex08_Operator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = (double)total / 3;
		System.out.println(total);
		System.out.println(avg);
		
		String result = (avg >= 60 && kor >= 40 && math >= 40 && eng >= 40)? "합격" : "불합격";
		System.out.println(result);
	}
}
