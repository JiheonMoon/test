package ex03_anonymous_class;
/*
 * 익명 클래스 anonymous class
 * 익명클래스는 클래스의 선언과 객체의 생성을 동시에 하므로 한번만 사용할수 있다.
 * 오직 하나의 객체만을 생성할수 있는 일회용 클래스
 * 따라서 생성자를 선언할수도 없으며, 둘 이상의 인터페이스를 구현할수도 없음
 */
public class Person {
	public void mySelf() {
		System.out.println("나는 인간입니다.");
	}
}
