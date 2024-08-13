package ex04_Set;

import java.util.HashSet;
import java.util.Set;

/*
 * Set - List와는 달리 객체의 저장순서를 보장하지 않음
 * Set 컬렉션은 수학의 집합과 유사한 개념을 지니고 있다
 * List 컬렉션은 저장시 중복을 허용하지만 Set 컬렉션은 데이터의 중복을 허용하지 않는다
 * 데이터를 저장할때 순서, 즉 index를 부여하지 않기 때문에 데이터가 입력된 순서대로 출력된다는 보장이 없음
 * 
 * Set 인터페이스에서 제공하는 메서드
 * void add(E e)				데이터를 순차적으로 삽입
 * void remove(Object o) 		선택된 값 삭제
 * void clean() 				모든 데이터 삭제
 * int size()					저장된 데이터 개수 반환
 * boolean contains(Object o)	데이터 존재 여부 확인
 * 
 * HashSet
 * Set 인터페이스에서 가장 많이 사용되는 클래스로 인터페이스를 상속받아 구현된다.
 */
public class Ex01_HashSet {
	public static void main(String[] args) {
		//HashSet 선언하기
		Set<String> hs1 = new HashSet<>();
		
		//HashSet 데이터 저장
		//HashSet 데이터를 저장할때 순서를 부여하지 않고 중복을 허용하지 않는다.
		//동일한 값 또는 객체를 허용하지 않는다는 의미
		//동일한 객체는, 꼭 같은 타입의 객체를 의미하는 것은 아니다.
		//HashSet은 데이터의 객체의 hashCode()값을 호출하여 비교하고
		//같으면 equals()메서드를 호출해 다시 두 객체가 같음을 증명함
		hs1.add("a");
		hs1.add("d");
		hs1.add("f");
		hs1.add("c");
		hs1.add("b");
		System.out.println(hs1);
		
		hs1.add("a");
		hs1.add("b");
		System.out.println(hs1);
		
		//set에 저장되어있는 데이터 제거하기
		//set은 index를 지원하지 않기 때문에 순서에 의한 삭제는 지원하지 않음
		hs1.remove("a");
		System.out.println(hs1);
		
		
	}
}
