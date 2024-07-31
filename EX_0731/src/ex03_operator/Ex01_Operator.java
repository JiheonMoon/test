package ex03_operator;

public class Ex01_Operator {

	public static void main(String[] args) {

		/*연산자 Operator
		 * 연산이란 항과 연산자로 이루어짐
		 * 항은 연산에 사용되는 값, 연산자는 기호
		 * 황과 연산자를 이용해 연산과정을 나열한것을 연산식 expression
		 * 
		 * 기본 연산자의 종류
		 * 피 연산자의 개수에 따라 단항, 이항, 삼항 연산자
		 * 목적에 따라 산술, 증감, 대입, 논리, 비트, 증감 등
		 * 
		 * 최고연산자 . ()
		 * 증감연산자 ++, --
		 * 산술연산자 +, -, *, /, %
		 * 시프트연산자 >>, <<
		 * 비교연산자 >, <, >=, <=, ==, !=
		 * 논리연산자 &&, ||, !
		 * 비트연산자 &, |, ~, ^
		 * 대입연산자 =,+=,-=,*=,/=,%=
		 * 삼항연산자 조건식? A : B
		 */
		
		//단항연산자 - 피연산자가 한개인 연산자 부호연산자(+,-), 증감연산자(++,--), 논리부정연산자(!)
		int num = 100;
		int resultPlus = +num; //+부호 (더하기 x)
		int resultMinus = -num; //-부호 (빼기 x)
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		double d = 1.11;
		double result = -d;
		
		System.out.println(-d);
		System.out.println(result);
		System.out.println(d);
	}

}
