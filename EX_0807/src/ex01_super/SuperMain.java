package ex01_super;

public class SuperMain {
	public static void main(String[] args) {
		Child c = new Child(1);
		//자식 객체를 생성하고 실행을 했는데 부모생성자 안에있는 명령이 실행됨
		//부모 생성자가 실행이 됐다는 의미
		System.out.println("money : " + c.money); //부모 객체가 만들어지면서, 자식객체가 부모의 필드를 사용할 수 있다.
	}
}
