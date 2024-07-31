package ex03_operator;

public class Ex04_Operator {
	public static void main(String[] args) {
		//대입 연산자 - 우변의 값을 좌변에 대입
		int n1 = 10;
		int n2 = 7;
		
		//복합 대입 연산자 - 산술연산자와 대입연산자가 합쳐진 형태 +=, -=, *=, /=, %=
		int x = 10;
		int y = 3;
		y += x; // y = y + x;
		System.out.println(y); //13
		
		y *= x; //y = y * x;
		System.out.println(y); // 130
		
		y %= x; //y = y % x;
		System.out.println(y); // 0
		
		//비교연산자 - 변수와 상수의 값을 비교하여 참과 거짓을 판단하는 연산자, 비교연산후 결과는 논리형으로 반환
		
		int a = 10;
		int b = 20;
		
		boolean result = a > b;
		System.out.println(result); //false
		result = a <= b;
		System.out.println(result); //true
		result = a == b;
		System.out.println(result); //false
		result = a != b;
		System.out.println(result); //true
	}
}
