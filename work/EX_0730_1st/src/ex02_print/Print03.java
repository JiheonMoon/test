package ex02_print;

public class Print03 {

	public static void main(String[] args) {
		//printf()는 값의 타입에 따라서 서식문자를 이용해 문장속에서 데이터 출력
		//%d 정수형
		//%f 실수형
		//%s 문자열
		//%c 문자형
		//%b 논리형
		
		//이스케이프 문자 특수한 기능이 있는 문자
		//\n 개행문자(줄바꿈)
		
		System.out.printf("저는 대학교 %d학년에 재학중입니다.\n",3);
		System.out.printf("%d는 첫번째, %f는 두번째, %s는 세번째\n", 1, 2.0, "셋");
		
		//출력값의 정렬
		//%5d : 주어진 숫자칸만큼 자리를 확보후 오른쪽 정렬하여 출력
		System.out.printf("%05d",1);
		System.out.println();
		System.out.printf("%05d",12);
		System.out.println();
		System.out.printf("%05d",123);
		System.out.println();
		System.out.printf("%05d",1234);
		System.out.println();
		System.out.printf("%05d",12345);
		System.out.println();
		
		//실수의 정렬
		//%.2f : 소수점 2째자리까지 출력 3째자리 반올림
		System.out.printf("%.1f",1.1234567);
		System.out.println();
		System.out.printf("%.2f",1.1234567);
		System.out.println();
		System.out.printf("%.3f",1.1234567);
		System.out.println();
		System.out.printf("%.4f",1.1234567);
		System.out.println();
		System.out.printf("%.5f",1.1234567);
		
		//오버 플로우 최대범위보다 큰수 저장할때 발생
		//언더 플로우는 최소범위보다 작은수 저장할때 발생
		
		//참조 자료형 메모리상에서 지정된 주소를 저장하기 위한 공간 String같은 개수가 정해져 있지 않다
	}

}
