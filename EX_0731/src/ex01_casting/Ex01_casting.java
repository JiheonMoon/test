package ex01_casting;

public class Ex01_casting {

	public static void main(String[] args) {
		/*
		 * 형변환 casting : 자료형을 다른 자료형으로 변환
		 * 서로 다른 자료형의 연산을 수행하기 위해 같은 자료형으로 변환 필요
		 */
		int num = 11;
		double num1Change = 3.14;
		num1Change = num; // 정수를 실수형 변수에 대입
		
		/*
		 * 형변환은 숫자를 담을수 있는 기본자료형간에만 가능함
		 * byte short int long float double
		 * 문자형인 char은 정수이기도 하므로 가능함
		 * 
		 * 자동형변환 promotion
		 * 서로 다른 자료형간의 대입이나 연산으로 할때 원래는 일치시켜야 하지만 다음과 같은 경우 자바의 컴파일러가 자동으로 형변환을 해줌
		 * 작은 자료형에서 큰 자료형으로 변환할 때
		 * byte->short->int->long
		 * float->double
		 */
		
		int i = 100;
		char c = 'a';
		i = c;
		double d = i;
		System.out.println("i의 값 : " + i);
		System.out.println("d의 값 : " + d);
	}

}
