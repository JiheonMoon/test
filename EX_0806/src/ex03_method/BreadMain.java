package ex03_method;

public class BreadMain {

	public static void main(String[] args) {
		//makeBread()메서드를 만든다
		//오버로딩을 통해서 다음과 같은 결과를 출력
		//첫번째 makeBread() - 빵을 만들었습니다
		//두번째 makeBread() - 빵을 만들었습니다 빵을 만들었습니다 ... 빵을 만들었습니다 요청하신 N개의 빵을 만들었습니다.
		//두번째 makeBread() - XX빵을 만들었습니다 XX빵을 만들었습니다 ... XX빵을 만들었습니다 요청하신 N개의 XX빵을 만들었습니다
		Bread b = new Bread();
		
		b.makeBread();
		System.out.println("------------------");
		b.makeBread(3);
		System.out.println("------------------");
		b.makeBread(4, "메론");
	}

}
