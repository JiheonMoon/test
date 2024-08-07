package ex01_super;
/*
 * super
 * 부모클래스에서 상속받은 필드나 메서드를 자식클래스에서 참조하는데 사용하는 참조변수
 */
public class Parent {//부모역할을 하는 클래스
	//모든 클래스는 생성자를 가진다.
	int money = 100000000; //부모가 가진 필드 
	public Parent(int n) {
		System.out.println("부모 클래스" + n);
	}
}
