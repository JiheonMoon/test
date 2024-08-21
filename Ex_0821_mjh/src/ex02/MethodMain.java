package ex02;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		int[] arr = {4,1,2,10,7,9,5,6,3,8};
		MethodTest mt = new MethodTest();
		mt.maxFinder(arr);
		
		Scanner sc=  new Scanner(System.in);
		System.out.print("온도 구하기 : ");
		switch(sc.nextInt()) {
		case 1:
			mt.fToc();
			break;
		case 2:
			mt.cTof();
			break;
		}
	}
}
