package ex02_bike;
/*
 * 강제타입변환
 * 부모타입으로 변환을 했지만 자식클래스의 멤버에 접근하고 싶을때가 있음
 * 자바의 규약으로 자식 클래스의 멤버로 접근할수 없으므로, 이러한 경우 다시 자식타입으로 변경해 접근할수 있도록 해야한다.
 * 클래스의 강제타입변환 - 자식객체가 부모타입으로 자동타입변환을 한 후, 다시 자식타입으로 변환하는것
 * 
 * 일회성으로 타입변환이 필요할때
 * ((자식클래스명)객체명).메서드명();
 * 
 * 자식클래스의 멤버에 접근이 여러번 필요한 경우
 * 변수명 = (자식클래스)부모타입객체
 */
public class Bike {
	String riderName;
	int wheel = 2;
	
	//riderName을 생성자를 통해 초기화
	public Bike(String riderName) {
		this.riderName = riderName;
	}
	
	public void info() {
		System.out.println(riderName + "의 자전거는 " + wheel + "발 자전거입니다.");
	}
	
	public void ride() {
		System.out.println("씽씽");
	}
}
