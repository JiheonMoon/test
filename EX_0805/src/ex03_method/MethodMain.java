package ex03_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest method = new MethodTest();
		int[] nums = {9,8,6,4,33,78,54};
		method.maxFinder(nums);
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String oper = sc.next();
		System.out.println("결과 : " + method.getResult(num1, num2, oper));
	}
}
