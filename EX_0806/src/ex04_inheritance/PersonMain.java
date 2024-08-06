package ex04_inheritance;

public class PersonMain {
	public static void main(String[] args) {
		Customer c1 = new Customer("박자바",24,20151515);
		Customer c2 = new Customer("송코딩",30,20200002);
		c1.enter();
		c2.enter();
	}
}
