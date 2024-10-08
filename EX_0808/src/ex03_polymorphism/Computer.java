package ex03_polymorphism;
/*
 * 다형성
 * 객체 지향 프로그래맹의 대표적인 특징중 하나로, 하나의 타입으로 다양한 개체를 사용할 수 있는것
 * 자바에서는 클래스 타입 변환을 통해, 부모 클래스 타입 하나로 여러가지 자식 객체들을 참조하여 사용함으로써 다형성을 구현할수 있음.
 * 완벽한 다형성을 구현하기 위해 상속+오버라이딩+클래스 타입변환 세가지 개념을 합쳐야함
 * 객체가 특정 클래스의 필드가 되면서, 하나의 부품처럼 사용할 수 있다.
 * 이때 부품을 교체할 일이 생긴다면, 우리는 다형성을 구현함으로써 코드수정을 최소화 할수 있다.
 */
public class Computer {
	public void powerOn() {
		System.out.println("컴퓨터가 켜졌습니다.");
	}
	
	public void powerOff() {
		System.out.println("컴퓨터가 종료됩니다.");
	}
}
