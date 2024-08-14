package ex04_generic;
//Gen 클래스를 정의하고 제네릭 타입 T를 갖는 printArr 메서드 생성
//printArr메서드 내부에서 배열을 순차적으로 출력하는 코드작성
//GenMain 클래스를 작성하고 Integer[],Double[],Chracter[]배열을 만든뒤 Gen클래스의 printArr 메서드를 호출하여 각 배열의 내용 출력하기

//결과
//1 2 3 4 5
//1.1 2.2 3.3 4.4 5.5
//A B C D E
public class Gen {
	public <T> void printArr(T[] arr) {
		for(T t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
}
