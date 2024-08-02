package ex03_array;

import java.util.Arrays;

public class Ex07_Arrays {
	public static void main(String[] args) {
		//배열의 복사
		//배열은 한번 생성하면 그 길이를 변경할수 없음
		//더 많은 데이터를 저장하거나 기존의 배열과 같은 배열을 새로 만드려면 배열을 복사해야한다
		//배열을 복사하는 방법에는 얕은복사와 깊은 복사 두가지가 있음
		//얕은 복사 : 복사된 배열이나 원본배열이 변경될때 서로간의 값이 함께 변경됨
		//깊은 복사 : 복사된 배열이나 원본배열이 변경될때 서로간의 값은 변경되지 않음
		
		//얕은 복사 - 주소값 복사
		int[] arr01 = {1,2,3};
		int[] arr02 = arr01;
		arr02[1] = 10;
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		
		//깊은 복사 - 배열의 깊은 복사는 반복문을 이용해 새로운 배열에 값을 직접 넣어주거나 Arrays 클래스 또는 System 클래스가 가진 기능 이용
		int[] cards = {1,6,4,5,3,2};
		int[] newCards = new int[cards.length];
		//반복문 사용
		for(int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}
		//Array 클래스 사용
		int[] newCards2 = Arrays.copyOf(cards, cards.length);
		
		//System 클래스 사용
		int[] newCards3 = new int[cards.length];
		System.arraycopy(cards, 0, newCards3, 0, cards.length);
		
		newCards[1] = 100;
		
		System.out.println("cards 배열 : " + Arrays.toString(cards));
		System.out.println("newCards 배열 : " + Arrays.toString(newCards));
		System.out.println("newCards2 배열 : " + Arrays.toString(newCards2));
		System.out.println("newCards3 배열 : " + Arrays.toString(newCards3));
	}
}
