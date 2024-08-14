package ex02_Map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map - List,Set과 달리 Map 인터페이스가 별도로 존재하며, 데이터를 List계열 컬렉션과 다르게 처리함
 * 데이터를 Key와 Value로 구분하여 저장하는 key-value방식을 사용
 * index는 없지만 key를 통해서 값을 검색하기 때문에, 많은 양의 데이터를 조회하는데 있어 매우 뛰어난 성능을 발휘
 * 
 * HashMap - map을 구현하는 있는 자식 클래스에서 가장 많이 사용하느 구현체
 */
public class Ex01_Map {
	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<>();
		//map에 데이터 추가하기
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'D');
		
		System.out.println(map);
		
		//map에서 value는 중복이 될 수 있다
		map.put(5, 'A');
		System.out.println(map);
		
		//map에서 key는 중복될수 없음
		map.put(5, 'B'); //기존에 같은 이름을 가진 key가 있다면 value를 갱신함
		System.out.println(map);
		
		//map에서 요소의 삭제는 key값을 통해서 함
		System.out.println("삭제한 값 : " + map.remove(3));
		System.out.println(map);
		
		//map의 크기
		System.out.println("map의 크기 : " + map.size());
		
		//map에서 특정 value 꺼내오기
		char res = map.get(4);
		System.out.println(res);
	}
}
