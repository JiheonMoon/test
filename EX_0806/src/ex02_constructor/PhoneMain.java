package ex02_constructor;

public class PhoneMain {

	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 24, "흰색");//인자를 3개 넣으면 매개변수 3개짜리 생성자가 실행
		Phone p2 = new Phone("아이폰", 16); //인자를 2개 넣으면 매개변수 2개짜리 생성자가 실행 
		
		p1.phoneInfo();
		p2.phoneInfo();
	}

}
