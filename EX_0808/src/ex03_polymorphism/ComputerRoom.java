package ex03_polymorphism;

//컴퓨터실
public class ComputerRoom {
	//필드가 있는 것이 기본 자료형이 아닌 개체 변수가 선언
	//Samsung com1;
	//Samsung com2;
	
	//LZ com1;
	//LZ com2;
	
	Computer com1;
	Computer com2;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}
}
