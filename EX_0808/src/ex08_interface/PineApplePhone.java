package ex08_interface;

public class PineApplePhone implements Phone{

	//인터페이스를 구현하는 클래스에 모든 추상메서드를 구체화 해야한다.
	
	//배터리양
	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("###POWER ON!!###");
			isOn = true;
		} else {
			System.out.println("Low Battery...");
		}
		
	}

	@Override
	public void powerOff() {
		System.out.println("###POWER OFF!!###");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("----watching Utube----");
			batteryCapacity -= 10;
			System.out.println("battery is " + batteryCapacity + "%");
		} else {
			System.out.println("Low Battery...");
			powerOff();
		}
		
	}

	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("---charging---");
			batteryCapacity += 5;
			System.out.println("Charged... " + batteryCapacity + "%");
		} else {
			System.out.println("You don't have to charge...");
			System.out.println("It's enough..." + batteryCapacity + "%");
		}
		
	}

}
