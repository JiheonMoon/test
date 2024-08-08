package ex01_calendar;

public class Calendar {
	String color;//달력의 색깔
	int months;//개월수를 필드로 가짐
	
	//필드는 생성자를 초기화 한다.
	public Calendar(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	//xx색 달력은 xx월까지 있습니다 라고 출력되는 info함수 만들기
	public void info() {
		System.out.printf("%s색 달력은 %d월까지 있습니다.\n", color, months);
	}
	
	//xx색 달력을 벽에 걸 수 있습니다 라고 출력되는 hanging 메서드 만들기
	public void hanging() {
		System.out.println(color + "색 달력을 벽에 걸 수 있습니다.");
	}
}
