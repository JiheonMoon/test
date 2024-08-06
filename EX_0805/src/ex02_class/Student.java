package ex02_class;

public class Student {
	static String schoolName = "코리아 고등학교";
	String studentName; //인스턴스 멤버
	
	static void goToSchool() {
		System.out.println("학교에 갑니다.");
	}
	void hello() { //인스턴스 메서드
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}
