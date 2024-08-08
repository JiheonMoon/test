package ex03_polymorphism;

public class Mac extends Computer{
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Hello Apple");
	}
	
	public void info() {
		System.out.println("이것은 맥이다.");
	}
}
