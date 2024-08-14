package ex04_generic;

import java.util.ArrayList;
import java.util.List;

/*
 * 다중타입한정
 * 만일 2개 이상의 타입을 동시에 구현한 경우 타입제한을 하고싶아면 &연산자를 사용한다
 * 해당 인터페이스들을 동시에 구현한 클래스가 제네릭 타입에 대상이 되게한다
 * 단, 자바에서는 다중 상속을 지원하지 않기에 클래스로는 다중 extends는 불가능하고 오로지 인터페이스만 가능
 *
 */

interface Readable{}
interface Closeable{}

class BoxType implements Readable,Closeable{}

class Box<T extends Readable&Closeable>{
	List<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
}

public class Ex03_Generic {
	public static void main(String[] args) {
		Box<BoxType> box = new Box<>();
		
//		Box<Object> box2 = new Box<>(); 최상위 클래스인 Object도 불가능
		
	}
}
