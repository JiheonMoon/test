package ex02_list;

import java.util.ArrayList;
import java.util.List;

/*
 * List 컬렉션
 * 배열과 유사한 자료구조로 중복이 허용되면서 저장순서가 유지되는 구조를 제공
 * 배열처럼 index를 사용해 데이터를 저장하고 찾게됨
 * 단, 배열과는 다르게 크기의 제한이 없으며 삽입, 삭제, 변경의 기능이 자유롭다
 * 데이터의 크리를 특정할수 없는 다량의 데이터를 저장할때 용이하게 사용할 수 있다.
 * 
 * List에서 제공하는 주요 메서드
 * void add(E e)			삽입 		데이터를 순차적으로 삽입
 * void add(int index, E e)	중간삽입 	원하는 index 위치에 삽입
 * void set(int index, E e)	치환		원하는 index 위치에 값 변경
 * E get(int index)			반환		선택된 index 위치의 값 반환
 * void remove(int index)	삭제		선택된 index 위치의 값 삭제
 * void clear()				전체삭제	모든 데이터 삭제
 * int size()				크기		저장된 데이터의 개수 반환
 * boolean contains(Object o)검색		데이터존재 여부 확인
 * 
 * ArrayList - 가장 많이 사용하는 List 인터페이스의 대표적인 구현 클래스
 * JDK 1.2부터 제공된 ArrayList는 내부적으로 배열을 이용해 구현되어 배열과 호환성이 좋은 자료구조
 * List<데이터타입> list = new ArrayList<데이터타입>();
 * JDK 1.7부터는 Collection 선언이 간소화됨
 * List<데이터타입> list = new ArrayList<>();
 */
public class Ex01_ArrayList {
	public static void main(String[] args) {
		//리스트 선언
		List<String> list = new ArrayList<>();
		
		//리스트에 데이터 추가
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		//리스트 출력
		System.out.println("리스트 내용 1 : " + list);
		
		//리스트 3번째 위치에 삽입
		//특정위치에 삽입
		list.add(2, "수박");
		System.out.println("리스트 내용 2 : " + list);
	}
}
