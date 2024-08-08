package ex08_interface;

//클래스 상속 extends
//인터페이스 구현 implements
public class ThreeStarPhone implements Phone {
	//배터리양
	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("###폰이 켜졌습니다!###");
			isOn = true;
		} else {
			System.out.println("배터리가 적습니다...");
		}
		
	}

	@Override
	public void powerOff() {
		System.out.println("###전원이 꺼집니다!###");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("----유튜브 시청중----");
			batteryCapacity -= 10;
			System.out.println("잔여 배터리는 " + batteryCapacity + "%");
		} else {
			System.out.println("배터리가 부족합니다...");
			powerOff();
		}
		
	}

	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("---충전중---");
			batteryCapacity += 5;
			System.out.println("잔여 배터리는 " + batteryCapacity + "%");
		} else {
			System.out.println("충전할 필요가 없습니다...");
			System.out.println("잔여배터리는" + batteryCapacity + "%");
		}
		
	}

}
