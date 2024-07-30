package ex03_variable;

public class Ex_Variable02 {
	public static void main(String[] args) {
		boolean b = true;//논리형
		System.out.println("b의 값 : "+ b);
		
		b = false;//다시 대입시 원래 있던 값은 없어짐
		System.out.println("b의 값 : "+ b);
		//b = 1;의 경우 자료형의 값이 올바르지 않아 오류발생
		
		//문자형
		char ch = 'A';
		System.out.println("ch의 값 : " + ch);
		ch = 66; //아스키 코드로 변환되어 출력
		System.out.println("ch의 값 : " + ch);
		
		//정수형
		//byte b1 = 128; byte 자료형의 범위를 벗어남
		byte b1 = 127;
		short s = 32767;
		int n = 550;
		System.out.println("b1의 값 : " + b1);
		System.out.println("s의 값 : " + s);
		System.out.println("n의 값 : " + n);
		
		//실수형
		//float f = 3.14; 자바에서 실수는 기본적으로 double 자료형으로 인식하기 때문에 float 자료형을 사용한다는것을 명시해줘야함
		float f = 3.14f;
		
		//내가 만드려는 변수의 타입이 어차피 같다면 한번에 여러개 선언과 초기화 가능
		float f1 = 1.23f, f2 = 2.09f;
		System.out.println("f의 값 : " + f);
		System.out.println("f1의 값 : " + f1);
		System.out.println("f2의 값 : " + f2);
		
		//변수를 이용해 다른변수 값 복사하기
		int myAge = 20;
		int yourAge = myAge;
		System.out.println("내 나이 :" + myAge);
		System.out.println("친구 나이 :" + yourAge);
		
		//두 변수의 값 바꾸기
		int su1 = 20, su2 = 30;
		System.out.println("변경전");
		System.out.println("su1 : "+ su1);
		System.out.println("su2 : " + su2);
		
		int temp;//내용물을 임시로 담아놓을 변수가 필요
		temp = su1;//temp에 20
		su1 = su2;//su1에 30
		su2 = temp;//su2에 20
		
		System.out.println("변경후");
		System.out.println("su1 : "+ su1);
		System.out.println("su2 : " + su2);
	}
}
