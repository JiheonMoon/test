package ex01_interface;

/*
 * 인터페이스 상속
 * 인터페이스끼리 상속관계를 만들수 있다.
 * 클래스에서의 상속과 마찬가지로 extends 키워드를 사용하며 다중상속이 가능하기 때문에 콤마를 이용해 여러개 상속하는것이 가능
 * 
 * interface 인터페이스명 extends 인터1,인터2...{
 * }
 * 인터페이스 상속을 선언하면, 하위 인터페이스는 상위 인터페이스의 모든 멤버를 상속받음
 * 하위 인터페이스를 구현하는 클래스가 있다면, 해당 클래스는 하위 인터페이스의 추상메서드를 포함하여 상위 인터페이스의 추상메서드까지 구현해야 한다.
 */
public class MicMain {

	public static void main(String[] args) {
		System.out.println("---Tjmic 객체---");
		Tjmic tj = new Tjmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("---Tjmic 개체를 BluetoothMic 타입으로 타입변환");
		BluetoothMic bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("---Tjmic 개체를 MicroPhone 타입으로 타입변환");
		MicroPhone m = tj;
		m.sing();
		//m.connect();
		//m.music();
		
		System.out.println("---Tjmic 개체를 Speaker 타입으로 타입변환");
		Speaker s = tj;
		s.music();
		//s.connect();
		//s.sing();
	}

}

