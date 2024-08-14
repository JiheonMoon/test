package ex03_generic;
/*
 * 제네릭 사용시 주의사항
 * 1.제네릭 타입의 객체는 생성할 수 없다. 제네릭 타입 자체로 객체를 생성하는것은 불가능
 * T t = new T(); 불가능
 * 
 * 2.static 멤버에 제네릭 타입이 올수 없음.
 * static 멤버는 클래스가 동일하게 공유하는 변수로서 제네릭 객체가 생성되기도 전에 이미 자료타입이 정해져 있어야 하기 때문이다
 * 
 * 2-1 static 메서드의 반환타입으로 사용이 불가능함
 * public static T getAge(int n){ ->불가능
 *  
 * }
 * 
 * 2-2 static 메서드의 매개변수 타입으로도 사용이 불가능함
 * 
 * pubic static void setAge(T age){}-> 불가능
 * 
 * 3.제네릭으로 배열 선언시 주의할점
 * 기본적으로 제네릭 클래스 자체를 배열로 만즐수는 없다.
 * Student<Integer>[] arr1 = new Student<>[10]; ->불가능
 * 
 * 제네릭 타입에 클래스가 들어온다는 것은, 클래스끼리 상속을 통해 관계를 맺는 다형성이 그대로 적용되지 않을까?
 * 
 *  
 */
public class Ex01_Generic {
	public static void main(String[] args) {
		//객체를 생성하면서 제네릭 변수에 타입이 결정됨
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(1000);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('B');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
		
	}
}
