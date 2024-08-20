package ex02_Enum;

import java.util.Arrays;

/*
 * 열거형
 * 상수를 가지고 생성되는 객체들을 한곳에 모아둔 하나의 묶음
 * 상수를 사용자가 지정한 이름들로부터 0부터 순차적으로 증가(index)
 * 클래스처럼 보이게 하는 상수
 * 관련있는 상수들을 모아서 배열처럼 정의
 * 
 * name - 열거형 상수의 이름을 문자열로 반환
 * ordinal - 열거형 상수가 정의된 순서를 반환
 * valueOf("상수명") - 인자로 받은 String 값과 일치하는 열거형 객체를 반환한다. 없으면 예외
 * values() - 열거형 안에 들어있는 내용을 Enum 타입의 배열로 반환
 * 
 * Enum 매핑
 * 열거형 상수에 고유한 값을 설정할수 있다.
 */
public class Ex01_Enum {
	public static void main(String[] args) {
		//value() -> 열거형 상수안에 들어있는 내용들을 enum타입의 배열로 반환
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		//name() - 열거 객체가 가지고 있는 문자열을 반환
		//ordinal() - 열거 타입을 정의할때 주어진 순번을 반환
		for(Item item : items) {
			System.out.println("name = " + item.name() + ", ordinal = " + item.ordinal());
		}
		
		//valueOf() : 매개변수로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 반환
		Item i1 = Item.valueOf("START");
		System.out.println(i1);
		Item i2 = Item.START;
		System.out.println(i2);
		Item i3 = Item.STOP;
		//열거형의 상수간의 비교는 ==을 사용함(상수끼리 주소를 비교)
		System.out.println(i1 == i2);
		
		//초과 미만 이상 이하와 같은 비교연산자는 사용불가
		//기준객체.compareTo(비교객체);
		//매개값으로 주어진 객체를 비교해서 순번차이를 반환
		//기준 객체가 비교 객체보다 순번이 빠르면 음수반환
		//기준 객체가 비교 객체보다 순번이 늦다 양수반환
		System.out.println(i1.compareTo(i3));
		
		switch(i1) {
		case START-> System.out.println("게임 시작!");
		case STOP -> System.out.println("게임 멈춤!");
		case EXIT -> System.out.println("게임 종료!");
			
		}
		
		//열거형 객체를 직접 만드는것은 불가능
		Season s = Season.SUMMER;
		System.out.println(s.name());
		System.out.printf("계절명 : %s (%s)", s.getSeason(), s.getE_season());
	}
}
