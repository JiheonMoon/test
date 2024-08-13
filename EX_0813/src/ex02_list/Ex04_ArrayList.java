package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		//ArrayList의 데이터 얻기
		List<Integer> list = new ArrayList<>(); //(ctrl + shift + o 한번에 import)
		
		//1~30 사이의 난수 10개를 list에 추가해주세요
		for(int i = 0; i < 10; i++) {
			int num = (int)(30 * Math.random()) + 1;
			list.add(num);
		}
		
		System.out.println(list);
		
		System.out.print("짝수 : ");
		for(int i = 0; i < list.size(); i++) {
			//List에서 각 index에 위치하는 값 가져오기
			int value = list.get(i);
			if(value % 2 == 0) {
				System.out.print(value + " ");
			}
		}
		System.out.println();
		//추가 add()
		//조회 get()
		//삭제 remove()
		//수정 set()
		//비어있나 isEmpty()
		//크기가 몇이냐 size()
		//포함하고 있나 contains()
		
		//향상된 for문을 통해 출력 가능
		for(int value: list) {
			System.out.println("값 : " + value);
		}
	}
}
