package ex04_Farm;

class Animal{
	public void cry() {} //오버라이드 하기위해 만든 메서드
}
class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("음메");
	}
}

class Farm{
	public void sound(Animal animal) {
//		if(animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		} else {
//			System.out.println("음메");
//		}
		animal.cry();
	}
}

public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		f.sound(p);
		f.sound(c);
	}
}

/*
 * instanceof와 '=='의 차이
 * A instanceof B : 객체변수 A가 B타입으로 생성된것인지 확인
 * A == B : A와 B가 같은 주소를 참조하고 있는지 확인
 * 
 * 오버로딩/오버라이딩
 * 객체지향 프로그래밍에서 다형성을 이야기할때 빼놓을수 없는 개념
 * 비슷한 기능을 하고 중복되는 구현이 필요하지만, 오버로딩/오버라이딩을 적절히 사욯라숭 있다면, 중복이 없는 최소한의 코드로 원하는 기능을 모두 구현가능
 * 
 * 오버로딩
 * 자바는 매개변수의 자료형/개수/순서를 기반으로 메서드를 구별하므로 하나의 클래스 안에서 같은 이름의 메서드를 여러거개 구현하고 필요에 따라 메서드를 선택해서 사용할수 있다.
 * 
 * 오버라이딩
 * 부모클래스에게 상속받은 메서드를 재정의하여 자식클래스에 상황에 맞게 구현하고 자식 객체를 통해 메서드를 호출하면 오버라이딩된 메서드가 호출된다.
 */

