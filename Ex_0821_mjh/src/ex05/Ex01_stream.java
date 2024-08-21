package ex05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Java에서 컬렉션의 데이터를 저장하고 특정 조건에 맞게만 필터링해서 출력하고 싶다
 * 반면 SQL 문법의 경우 사용자가 원하는 조건의 데이터를 검색할때 명시적이고 간단하다
 * 
 * 자바에서 새로 추가된 기능은 스트림은 java 컬렌션 데이터에 대해 SQL 질의문처럼 데이터를 처리할수 있는 기능을 가지고 있다
 * 
 * 자바에서 컬렉션 데이터를 처리 할때 for foreach를 사용하면 컬렉션 내부의 요소들을 하나씩 다루었다
 * 크기가 작으면 상관없지만 커지면 루프문의 사용은 성능저하를 일으킴
 * 
 * 스트림의 등장
 * Java8에 추가된 기능으로 컬렉션 데이터를 선언형으로 쉽게 처리할수 있다
 * 복잡한 루프문을 사용하지 않아도 되며, 루프문을 중첩해서 사용해야 하는 경우도 많이 줄어들었다
 * 
 * 스트림은 '데이터의 흐름' 배열 또는 컬렉션 객체에 메서드 여러개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을수 있다
 * 또한 람다식을 이요해 코드의 양을 줄이고 간결하게 표현할수 있다.
 * 즉, 배열과 컬렌션을 함수형으로 처리할수 있다
 * 
 * 스트림의 특징
 * 스트림은 데이터 소스로부터 데이터를 읽기만 할뿐 데이터 소스를 변경하지 않음
 * 스트림은 한번 사용하면 닫히기 때문에 다시 사용할수 없음 다시 사용하려면 다시 생성해야함
 * 
 * 스트림을 사용하는 법
 * 1.생성 - 스트림 객체 생성
 * 2.가공 - 필터링 매핑 등 원하는 결과를 만들어가는 중간작업
 * 3.결과 만들기 - 최종적으로 결과를 만들어 반환하는 작업
 * 
 * 배열을 통한 생성
 * Stream<T> stream = Arrays.stream(배열);
 * 
 * 컬렉션을 통한 생성
 * Stream<T> strean = 컬렉션개체.stream();
 * 
 * 기본타입형 스트림생성
 * Stream은 제네릭을 갖는데, 기본자료형을 다루려면 오토박싱&언박싱이 발생하여 비효율성이 증가한다
 * 비효율성을 줄이기 위해 데이터 소스의 요소를 기본형으로 다루는 스트림이 제공된다
 * 
 * IntStream
 * LongStream
 * DoubleStream
 */
public class Ex01_stream {
	public static void main(String[] args) {
		String[] strArray = {"홍길동" , "김자바", "박디비"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(System.out::println);
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(System.out::println);
	}
}
