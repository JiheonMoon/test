package ex01_lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * 메서드의 참조
 * 메서드를 참조해서 매개변수의 정보 및 리턴타이븡ㄹ 알아내서, 람다식에서 불필요한 매개변수를 제거하는 것
 * 람다식이 하나의 메서드만 호출하는 경우 메서드참조라는 방법으로 람다식을 간결하게 할수있다
 * 하나의 메서드만 호출하는 람다식은 클래스명::메서드명 또는 참조변수::메서드명으로 바꿀수 있다.
 */
public class Ex07_lambda {
	public static void main(String[] args) {
		//Function<String, Integer> f = s -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt;
		System.out.println("정수 100 : " + f.apply("100"));
		
		//BiFunction<String, String, Boolean> f2 = (s1,s2) ->s1.equals(s2);
		BiFunction<String, String, Boolean> f2 = String::equals;
	}
}
