package ex02_class;

public class Car {
	//필드는 각 객체가 갖는 변수
	//int wheel; //필드의 선언
	
	int wheel = 4; //필드의 초기화
	
	//메서드의 정의
	void ride() { 
		System.out.println("달립니다");
	}
	
	//기본생성자
	//클래스명(){
	//}
	
	Car(){
		
	}
	//생성자를 통해 객체변수를 초기화 한다는 말은, 필드와 메서드를 호출할수 있는
	//객체를 사용하기 위해 객체변수가 메모리가 올라가야 하는데, 메모리에 객체를 올려주는 역할을 함
	
}
