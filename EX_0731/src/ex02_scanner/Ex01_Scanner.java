package ex02_scanner;
import java.util.Scanner;

public class Ex01_Scanner {

	/*
	 * 데이터를 키보드로 입력하기 위해서는 java.util 패키지에 있는 Scanner 클래스를 이용
	 * 
	 * 다른 패키지에 있는 클래스를 사용하려고 할때 import라는 작업을 해야함
	 * import 해당 클래스 경로
	 * import java.util.Scanner;
	 * 
	 * Scanner 클래스의 객체를 생성해야함
	 * Scanner 객체명 = new Scanner(System.in);
	 * int 변수 = 객체명.nextInt();
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		System.out.printf("제 나이는 %d세 입니다 \n", age);
		System.out.println("--------------------");
		//제 이름은 xxx입니다
		//제 나이는 xx살입니다
		//제 주소는 xxx입니다
		//제 키는 xx.xcm입니다
		System.out.print("나이를 입력해주세요 : ");
		int age2 = scan.nextInt();
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		scan.nextLine(); //scan.skip("\r\n")
		System.out.print("주소를 입력해주세요 : ");
		String home = scan.nextLine();
		System.out.print("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		System.out.printf("제 나이는 %d세 입니다 \n", age2);
		System.out.printf("제 이름은 %s 입니다 \n", name);
		System.out.printf("제 주소는 %s 입니다 \n", home);
		System.out.printf("제 키는 %f 입니다 \n", height);
	}

}
