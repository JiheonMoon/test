package ex01_lambda;

@FunctionalInterface
interface Iminus{
	int minus(int x, int y);
}

public class Ex01_lambda {
	public static void main(String[] args) {
		//람다식을 반환값에 넣는다.
		Iminus im = makeFuction(); //(x, y) -> x - y;
		int res = im.minus(3, 1);
		System.out.println(res);
	}
	
	//반환형은 반환값이랑 일치해야 한다.
	public static Iminus makeFuction() {
		return (x, y) -> x - y;
	}
}
