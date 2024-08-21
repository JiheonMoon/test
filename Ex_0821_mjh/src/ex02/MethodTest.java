package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTest {
	Scanner sc = new Scanner(System.in);
	
	public void maxFinder(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}
	
	
	public void fToc() {
		System.out.print("화씨 온도 입력 : ");
		double f = sc.nextDouble();
		double c = (f - 32) / 1.8;
		System.out.printf("섭씨 온도 : %.2f", c);
	}
	
	public void cTof() {
		System.out.print("섭씨 온도 입력 : ");
		double c = sc.nextDouble();
		double f = 1.8 * c + 32;
		System.out.printf("화씨 온도 : %.2f", f);
	}
}


