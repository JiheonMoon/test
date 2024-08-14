package ex04_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 배열과 같은 일반적인 변수 타입과 달리 제네릭 서브 타입간에는 형변환이 불가능하다.
 * 심지어 대입된 타입이 Object일지라도 말이다.
 * 자연스럽게 다형성이 적용될 것이라고 생각할 수 있지만 실상 제네릭은 전달받은 타입으로만 캐스팅이 가능하다.
 * 
 * 제네릭 와일드 카드
 * 제네릭간의 형변환을 성립되게 하기 위해서는 제네릭에서 제공하는 와일드카드 문법을 이용해야한다
 * 
 * <?>: Unbounded WildCards(제한 없음)
 * 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올수있다
 * 
 * <? extends 상위타입> Upper Bounded WildCards(상위 클래스 제한)
 * 타입 파라미터를 대치한 구제적인 타입으로 상위 타입이나, 상위타입의 하위타입만 올수 있다.
 * 
 * <? super 하위타입> Lower Bounded WildCards(하위 클래스 제한)
 * 타입 파라미터를 대치하는 구체적인 타입으로 하위타입이나, 하위타입의 상위타입만 올수 있다.
 */
public class Ex04_Generic {
	public static void main(String[] args) {
		//<? extends Object> -> Object부터 하위클래스가 올수 있다.
		List<? extends Object> list = new ArrayList<String>();
		
		//<? super String> -> Object부터 상위클래스가 올수 있다.
		List<? super String> list2 = new ArrayList<Object>();
		
		List<Integer> lists = new ArrayList<Integer>(Arrays.asList(1,2,3));
		print(lists);
	}
	
	//매개변수로 Number와 그 하위 타입(Integer, Double) 만 받는다
	public static void print(List<? extends Number> list) {
		for(Object e: list) {
			System.out.println(e);
		}
	}
	
}


