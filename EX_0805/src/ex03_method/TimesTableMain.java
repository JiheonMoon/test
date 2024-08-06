package ex03_method;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TimesTable t = new TimesTable();
		
		System.out.print("정수를 입력하세요 : ");
		t.showTable(sc.nextInt());
	}

}
