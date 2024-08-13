package ex01_generic;
/*
 * 컬렉션 프레임워크
 * 배열의 경우 한번 정한 크기를 변경하거나 삭제할수 없음
 * 또한 별도의 기능이 없기 때문에 직접 index를 이용해 데이터를 저장해야함
 * 자바는 이러한 불편함을 해결하기 위해 필요한 자료 구조를 미리 구현하여 java.util 패키지에서 제공하고 이를 컬렉션 프레임워크라고 한다.
 * 컬렉션은 기존에 있던 자료구조 List Queue Tree 등의 자료구조를 의미함
 * 
 * List - 순서가 있는 데이터의 집합. 데이터의 중복 허용
 * ArrayList, LinkedList
 * 
 * Set - 순서를 유지하지 않는 데이터의 집합. 데이터의 중복 허용X
 * HashSet, LinkedHashSet
 * 
 * Map - key와 value의 쌍으로 이루어진 데이터의 집합. 순서X. 키는 중복X. 값은 O
 * HashMap, LinkedHashMap, Properties
 * 
 * 제네릭
 * JDK 1.5이전에는 여러타입을 사용하는 대부분의 클래스나 메서드의 반환값으로 Object 타입을 사용했음
 * 잘못된 캐스팅으로 인해 오류가 발생할수도 있었음.
 * 제네릭을 사용하면 컴파일 할때 미리 타입이 정해지므로, 타입 검사나 변환과 같은 번거로운 작업을 생략할수 있다.
 * 클래스나 메서드 내부에 사용될 데이터 타입의 안정성을 높힐 수 있다.
 * 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
 * 객체별로 다른 타입의 자료가 저장될수 있도록 함
 */
public class DataList<T> {
	private Object[] data;//Object 타입의 배열
	private int size; //배열의 크기
	private int defaultSize = 10; //기본 배열의 크기
	
	//생성자 호출시 기본 크기만큼의 배열 생성
	public DataList() {
		data = new Object[defaultSize];
	}
	
	//생성자 오버로딩을 통해 내가 원하는 크기 만큼의 배열을 생성
	public DataList(int size) {
		data = new Object[size];
	}
	
	//매개변수에 전달된 값을 배열에 순차적으로 대입하는 add 메서드
	public void add(T value) {
		data[size++] = value;
	}
	
	//인덱스를 전달받아 배열에 들어있는 값을 반환받는 get 메서드
	public T get(int index) {
		return (T)data[index];
	}
	
	//배열의 크기를 반환하는 size() 메서드
	public int size() {
		return size;
	}
	
}
