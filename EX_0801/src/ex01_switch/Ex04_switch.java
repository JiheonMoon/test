package ex01_switch;

public class Ex04_switch {

	public static void main(String[] args) {
		// java12 버전 이상에서 switch문 조건에 복수의 값을 사용하는게 가능하다
		//기존 switch문과 달리 case에 해당하는 명령만 실행되고 그 이후는 실행되지 않음
		
		String day = "Sunday";
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wendsday":
		case "Thursday":
		case "Friday":
			System.out.println("평일");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("주말");
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
		
		//자바12이상에서의 switch
		switch(day) {
		case "Monday","Tuesday","Wendsday","Thursday","Friday" -> System.out.println("평일");
		case "Saturday", "Sunday" -> System.out.println("주말");
		default -> System.out.println("잘못된 입력입니다.");
		}
		
	}

}
