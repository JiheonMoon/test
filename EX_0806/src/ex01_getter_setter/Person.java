package ex01_getter_setter;

public class Person {
	/*
	 * setter&getter 지금까지 객체의 필드를 객체의 내부 뿐만 아니라 객체의 밖에서도 마음껏 사용할수 있었고, 마음대로 갑을 바꿀수도 있었다.
	 * 필드에 마음대로 접근할수 있고 값을 변경할수 있으면 문제가 생길 가능성이 있다.
	 * 메서드를 통해 필드의 값을 설정하거나 불러오는 방법을 이용함
	 * 
	 * 메서드를 통해 필드에 접근할때 장점
	 * -필드를 보호할수 있다
	 * -메서드에서 필드에 들어갈 값을 검증한 후 대입할 수 있다
	 * -외부에서 사용할 필드의 값을 정제한 후 값을 사용할 수 있다
	 * 
	 * setter - 외부에서 메서드를 통해 데이터에 접근하고 검증할수 있도록 유도하는 메서드
	 * getter - private 필드를 객체 외부에서 값을 불러오기 위해 구현하는 메서드
	 * private 필드는 객체 외부에서 접근이 불가능하지만, 필드가 선언된 클래스에서는 어디서는 접근이 가능
	 * 따라서 메서드를 통해 값을 전달해줄수 있음
	 */
	private int age; //필드에 직접 접근하지 못하도록 private로 설정해 범위 제한

	
	//메서드가 public이면 외부에서 사용가능
	public int getAge() {
		return age;
	}

	public void setAge(int num) {
		if(num <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값을 입력해주세요.");
			return; //메서드 종료
		}
		age = num; //age 필드에 num 값 대입
	}
	
}
