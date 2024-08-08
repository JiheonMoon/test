package ex03_polymorphism;

public class ComMain {

	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		//cr.com1, com2 -> computer 타입
		cr.com1 = new Mac();
		cr.com2 = new LZ();
		
		//자식타입으로 강제타입변환
		((Mac)(cr.com1)).info(); //임시
		Mac mac  = (Mac)cr.com1; //변수에 저장
		mac.info();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		//객체를 변경하기 위해서 여러 코드를 수정하는 것은 위험도가 높은 작업이다.
		//실무에서 프로그램은 코드의 양이 많아지고, 수많은 객체가 서로 얽혀서 복잡한 로직으로 구성되어 있다.
		//그렇기 때문에 수정을 최소화 하는것이 좋음                       
	}
/* instanceof 연산자
 * 부모타입으로 변환되어 저장된 변수 안에는 어떤 객체가 담겨 있는지 직접 확인하지 않는 이상 내부객체를 알기 쉽지 않다
 * 오버라이딩된 메서드가 있다면 확인이 쉽겠지만, 부모클래스를 같이 상속받고있는 다른클래스, 또는 부모클래스와 구별할수 있는 특정멤버가 없다면 어떻게 구별해야 할까?
 * 
 * instanceof 연산자의 특징
 * A instanceof B: A객체가 생성될때 B객체로 생성되었는지 확인하는 연산자
 * 맞으면 true 틀리면 false를 반환하며, null이라면 false를 반환함
 * 
 * 객체명 instanceof 클래스명
 */
}
