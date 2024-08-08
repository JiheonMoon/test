package ex08_interface;

public class Person {
	Phone p; //PineApple폰, ThreeStar 폰
	
	public Person(Phone p) {
		this.p = p;
	}
	
	public void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println("= = = = =");
		System.out.println("새 폰을 샀습니다.");
	}
	
	public void turnOnPhone() {
		p.powerOn();
	}
	
	public void turnOffPhone() {
		p.powerOff();
	}
	
	public void watchUtube() {
		if(p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("폰이 꺼져있기 때문에 U튜브를 볼수 없습니다.");
		}
	}
	
	public void chargePhone() {
		p.charge();
	}
}
