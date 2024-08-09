package ex01_interface;
/*
 * 다중 인터페이스의 구현
 * 하나의 클래스로 여러개의 인터페이스를 구현할수 있다.
 * 선언한 모든 인터페이스에 대한 추상 메서드를 모두 구현해야한다.
 * 
 * class 클래스명 implements 인터1,인터2{
 * 		필드 메서드 생성자 추상메서드 구현체
 * }
 */
public interface MicroPhone {
	public abstract void sing();
}
