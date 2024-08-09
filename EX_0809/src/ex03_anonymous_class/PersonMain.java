package ex03_anonymous_class;

public class PersonMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		//만약 Person을 상속받아 처리해야하는 클래스 또 필요하긴 하지만
		//한번만 사용하고 말거라면 굳이 또 만들필요가 있을까?

		//회사원
		Person w = new Person() {
			@Override
			public void mySelf() {
				System.out.println("나는 회사원입니다.");
			}//익명클래스
		};
		
		w.mySelf();
	}

}
