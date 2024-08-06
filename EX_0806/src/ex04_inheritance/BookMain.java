package ex04_inheritance;

public class BookMain {
	public static void main(String[] args) {
		Comic comicBook = new Comic(); //Comic 클래스의 객체 생성
		//자식클래스는 부모클래스의 필드와 메서드를 가져다 사용할수 있다.
		//자식클래스라도 부모클래스의 필드가 private로 선언되면 사용할수 없음
		comicBook.title = "포켓몬";
		comicBook.price = 4500;
		comicBook.info();
	}
}
