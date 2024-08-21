package ex05;

import java.util.Arrays;

/* 최종연산
 * 연산결과가 스트림이 아닌 연산
 * 스트림 요소를 소모하므로 한번만 가능
 * 
 * void forEach(Consumer <? super T> action) 요소를 순회
 * long count() 스트림의 요소의 개수를 반환
 * Optional <T> max(Comparator <? super T> comparator) 최대값
 * Optional <T> min(Comparator <? super T> comparator) 최소값
 * Optional <T> findAny() 스트림의 요소를 하나 반환
 * Optional <T> findFirst() 스트림의 첫번째 요소 반환
 * boolean allMatch(Predicate<T> p) 모두 만족하는지 확인
 * boolean anyMatch(Predicate<T> p) 하나라도 만족하는지
 * boolean noneMatch(Predicate<T> p) 모두 만족하지 않는지
 * Object[] toArray()
 * A[] toArray(IntFunction<A[]> generator) 스트림의 모든 요소 배열로 반환
 * Optional<T> reduce(BinaryOperator<T> accumulator)
 * T reduce(T identity, BinaryOperator<T> accumulator) 요소를 하나씩 줄여가며 계산
 */
public class Ex05_stream {
	public static void main(String[] args) {
		String[] list2 = {"김길동", "박자바", "제이슨", "심슨"};
		String[] list2_1 = Arrays.stream(list2).sorted().toArray(String[]::new);
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list2_1));
	}
}
