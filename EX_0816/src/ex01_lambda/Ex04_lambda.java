package ex01_lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * java.util.function 패키지
 * 대부분의 메서드의 타입이 비슷하고 매개변수는 0~2개정도 사용함 반환값은 없거나 있거나
 * 제네릭 메서드로 정의를 한다면 매개변수나 반환타입이 달라도 문제가 되지 않을까?
 * java.util.function 패키지에 일반적으로 자주쓰는 형식의 메서드를 함수형 인터페이스로 미리 정의를 해놨음
 * 매번 함수형 인터페이스를 정의하기보다는 가능한 이 패키지의 인터페이스를 활용하는것이 좋음
 * 
 * java.util.function 패키지의 주요 인터페이스
 * java.lang.Runnable	void run()			매개변수 없고 반환값도 없음
 * Supplier				T get()				매개변수 없고 반환값만 있음
 * Consumer				void accept(T t)	매개변수 한개, 반환값 없음
 * Function<T,R>		R apply(T t)		매개변수 한개, 반환값 있음
 * Predicate			boolean test(T t)	조건을 표현하는데 사용
 * 
 * 매개변수가 두개인 함수형 인터페이스
 * BiConsumer<T,U> void accept(T t, U u)
 * BiConsumer<T,U> boolean test(T t, U u)
 * BiConsumer<T,U,R> R apply(T t, U u)
 */


public class Ex04_lambda {
	public static void main(String[] args) {
		Consumer<String> c1 = t -> System.out.println("입력값 : " + t);
		c1.accept("홍길동");
		BiConsumer<String, Integer> c2 = (x,y) -> System.out.println("입력값1 : " + x + " 입력값2 : " + y);
		c2.accept("제임스", 1000);
		
		Supplier<Object> s1 = () -> new Object();
		System.out.println("주소 : " + s1.get());
		
		//String.valueOf(정수) 정수에서 문자열로 변환
		Function<Integer,String> f1 = x -> String.valueOf(x);
		System.out.println("문자열 : " + (f1.apply(100)) + 1);
		
		BiFunction<String, String , Boolean> f2 = (x, y) ->x.equals(y);
		if(f2.apply("토마토", "토마토")) {
			System.out.println("두 문자열의 값은 같습니다.");
		}
		
		Predicate<Integer> p1 = t -> t >= 60;
		int score = 65;
		boolean pass = p1.test(score);
		if(pass) {
			System.out.println("홍길동님의 점수는 : " + score + "점이고 합격입니다.");
		} else {
			System.out.println("홍길동님의 점수는 : " + score + "점이고 불합격입니다.");
		}
	}
}
