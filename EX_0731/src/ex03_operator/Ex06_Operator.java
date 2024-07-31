package ex03_operator;

public class Ex06_Operator {

	public static void main(String[] args) {
		/* 비트연산자
		 * 논리연산자와 유사하지만 bit(2진수)단위의 연산만 가능
		 * 시프트 연산자와 더불어 암호화 복호화 작업에 사용
		 * 
		 * & 논리곱 두항이 모두 1이면 1 아니면 0
		 * | 논리합 두항중 하나라도 1이면 1 아니면 0
		 * ^ 배타적논리합 두항이 달라야 1, 같으면 0
		 * ~ 부정 1을 0으로 0을 1로
		 */
		int a = 10; //1010
		int b = 7;  //0111
		int c = a & b;//0010
		
		System.out.println(c); //2
		
		c = a|b; //1111
		System.out.println(c); //15
		
		c = a ^ b; //1101
		System.out.println(c); //13
		
		int x = 7; //0111 
		System.out.println(~x);//-8 -(x+1)
	}

}
