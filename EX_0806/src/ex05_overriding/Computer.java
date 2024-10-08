package ex05_overriding;

public class Computer {
	/*
  	 * 오버라이딩 Overriding
	 * 부모클래스에서 상속받은 자식클래스는 부모클래스의 필드와 메서드를 가져와서 그대로 사용할수 있다
	 * 하지만 필요하다면 자식클래스가 상속받은 메서드의 내용을 변경해서 사용할 수 있다.
	 * 우리는 이렇게 상속받은 메서드를 변경해서 다시 구현하는것을 오버라이딩이라고 한다.
	 * 
	 * 오버라이딩 규칙
	 * 1.부모클래스의 메서드명, 반환명, 매개변수까지 동일해야함
	 * 2.부모클래스의 메서드보다 접근제한범위를 줄일수는 있으나 넓힐수는 없다.
	 * 
	 * @ 자바에서 @를 어노테이션이라고 부름
	 * 주석과 마찬가지로 코드를 실행하는데 직접적인 영향을 미치지는 않음
	 * 자동완성으로 오버라이딩을 구현하면, Override 메서드가 상단에 추가된다.
	 * 생략해도 괜찮지만 컴파일러에게 오버라이딩된 메서드라고 한번더 짚어줌으로써 오타가 났을때 오류를 발생시켜주기 때문에 실수를 줄일수 있음
	 */
	void powerOn() {
		System.out.println("삑~ 컴퓨터가 켜졌습니다.");
	}
	
	void powerOff() {
		System.out.println("컴퓨터가 종료됩니다.");
	}
}
