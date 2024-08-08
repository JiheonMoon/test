package ex06_phone;
/*
 * 추상클래스와 추상메서드의 용도
 * 자식클래스간의 공통적인 필드와 메서드 이름을 통일할 수 있다.
 * 반드시 구현해야 하는 메서드를 선언함으로써 공통 규격을 제공한다.
 */
public abstract class Phone {
	abstract public void openingLogo();
	
	public void powerOn() {
		openingLogo();
		System.out.println("핸드폰이 켜집니다.");
	}
	
	public void powerOff() {
		System.out.println("핸드폰이 꺼집니다.");
	}
	
}
