package ex01_super;

public class Child extends Parent {
	public Child(int n) {
		//super(); 부모 클래스의 생성자에 매개변수가 없으면 생략가능.
		super(n); //부모 생성자의 호출, 부모생성자가 매개변수를 갖기 시작하면 생략할수 없음
		
	}
}
