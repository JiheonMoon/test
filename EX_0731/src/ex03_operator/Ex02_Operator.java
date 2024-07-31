package ex03_operator;

public class Ex02_Operator {
	public static void main(String[] args) {
		//증감연산자 1씩증가 1씩 감소 ++, --
		//선행증감
		int a = 10;
		System.out.println("a : " + ++a); //11
		//후행증감
		int b = 10;
		System.out.println("b : " + b++); //10
		System.out.println("b : " + b); //11
		
		char alphabetA = 'A';
		System.out.println(alphabetA++); //A
		System.out.println(alphabetA); //B
		
		byte value = 127;
		value++; //정수타입 연산에서 오버플로우 발생시 최소값으로 돌아감
		System.out.println(value); //-128
		
		byte value2 = -128;
		value2--; //정수타입 연산에서 언더플로우 발생시 최대값으로 돌아감
		System.out.println(value2); //127
		
		int x = 5;
		int y = x++;
		System.out.println("x의 값 : " + x); //6
		System.out.println("y의 값 : " + y); //5
		
		x = 10;
		y = 20;
		int z = (++x) + (y--);
		System.out.println("z의 값 : " + z); //31
		System.out.println("y의 값 : " + y); //19
		
		//논리 부정 연산자
		//boolean 앞에 !를 붙여 반대로 바꾸는 역할 true를 false로 false를 true로
		boolean isHuman = false;
		System.out.println(isHuman); //false
		System.out.println(!isHuman); //true
		
		//사용한곳에서만 적용이 될 뿐 원래 변수에 들어있는 값은 바귀지 않음
	}
}
