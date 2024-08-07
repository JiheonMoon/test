package ex01_super;
//클래스의 3요소 : 필드, 메서드, 생성자
class Car{
	private int gasGauge; //필드
	
	public Car(int gasGauge) { //생성자
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() { //메서드
		System.out.println("잔여 가스량 : " + gasGauge);
	}
	
}

class HybirdCar extends Car{
	private int electricGauge;
	
	public HybirdCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge(); //부모클래스의 메서드를 실행
		System.out.println("잔여 전기량 : " + electricGauge);
	}
	
}

class HybirdWaterCar extends HybirdCar{
	private int waterGauge;
	
	public HybirdWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge,electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물량 : " + waterGauge);
	}
	
}

public class CarMain {
	public static void main(String[] args) {
		HybirdWaterCar hwc = new HybirdWaterCar(15, 30, 25);
		hwc.showCurrentGauge();
	}
}
