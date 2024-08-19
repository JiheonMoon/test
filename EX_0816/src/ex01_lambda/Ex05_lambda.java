package ex01_lambda;

import java.util.function.Function;

/*
 * 람다식의 합성과 결합
 * 두 람다식을 합성해서 새로운 람다식을 만들수 있음
 * f.andThen(g) -> f를 먼저 적용하고 그다음에 g를 적용
 * f.compose(g) -> g를 먼저 적용하고 그다음에 f를 적용
 * Function.identity() - 함수를 적용하기 이전과 동일한 항등함수, x -> x
 * 
 * 결합
 * Predicate를 and() or() negate()로 연결하여 새로운 Predicate로 결합할수 있다
 * Predicate의 끝에 negate()를 붙이면 조건식 전체가 부정이 된다
 * static 메서드인 isEqual()은 두 대상을 비교하는 Predicate를 만들때 사용한다.
 */
public class Ex05_lambda {
	public static void main(String[] args) {
		//R apply(T t)
		Function<String, Integer> f = s -> Integer.parseInt(s, 16); //16진수를 10진수로
		Function<Integer, String> g = i -> Integer.toBinaryString(i); //2진수로 변환
		Function<String, String> h = f.andThen(g);
		System.out.println(h.apply("FF")); //FF -> 255 -> 1111 1111
		
		Function<Integer, String> x = i -> Integer.toBinaryString(i);
		Function<String, Integer> y = s -> Integer.parseInt(s,16);
		Function<Integer, Integer> z = y.compose(x);
		System.out.println(z.apply(2)); // 2 -> "10" -> 16
		
		
	}
}
