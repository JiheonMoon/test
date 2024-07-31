package ex03_operator;

public class Ex05_Operator {

	public static void main(String[] args) {
		// 논리연산자 - 피연산자 논리형 데이터 2개를 필요로 함
		//&& - and(그리고)의 의미를 가지고 있음. 앞뒤의 피연산자가 모두 true여야 true 반환.
		//T && T -> T
		//F && T -> F
		//T && F -> F
		//F && F -> F
		System.out.println(true && true); //true
		
		int myAge = 30;
		int limit = 35;
		boolean result = (limit - myAge) > 5 && (myAge+=1) > 30; //F && T 
		System.out.println(result);
		System.out.println(myAge); //30 만약 앞피연산자가 false면 뒤의 피연산자가 계산되지 않음
		
		//|| - (또는)OR의 의미를 갖고있음. 앞뒤의 피연산자중 하나라도 true면 true 반환
		//T && T -> T
		//F && T -> T 
		//T && F -> T
		//F && F -> F
		
		int n1 = 10;
		int n2 = 20;
		boolean result2 = (n1+=10) >= 20 || (n2+=1) - 10 == 11; // T && T
		System.out.println(result2);
		System.out.println(n2);//20 만약 앞피연산자가 true면 뒤의 피연산자가 계산되지 않음
	}

}
