package ex05_lambda;
@FunctionalInterface
interface Iadd {
	int add(int x, int y);
}
public class Ex02_lambda {
	public static void main(String[] args) {
		//람다식을 메서드의 매개변수로 활용하기
		Iadd add = (x,y) -> x+y;
		
		int res = result(add);
		System.out.println("람다식 매개변수로 활용 : " + res);
	}
	
	public static int result(Iadd lambda) {
		return lambda.add(1, 2);
	}
}
