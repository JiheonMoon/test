package ex01_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
/*
 * 함수형 인터페이스로 사용할대 추상메서드는 하나여야 한다
 * 단, 디폴트 메서드는 여러개여도 상관없음
 */

public class Ex03_lambda {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("이름1","이름2","이름3","이름4","이름5"));
		System.out.println(list);
		
		for(String s : list) {
			System.out.print(s+ " ");
		}
		System.out.println();
		
		//void.accept(T t)
		// t -> System.out.println(t);
		//System.out::println
		Consumer<String> print = t -> System.out.print(t + " ");
		list.forEach(t -> System.out.print(t + " "));
		
		
	}
}
