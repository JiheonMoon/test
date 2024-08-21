package ex05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림의 연산
 * 메서드를 통해 연산을 하는데, 메서드의 실행 결과가 다시 스트림이다
 * 체인 형태로 이어서 연산을 하는것이 가능
 * 
 * distinct() 중복을 제거
 * filter(Predicate<T> predicate) 조건에 안맞는 요소를 제외
 * limit(long maxSize) 스트림의 일부 잘라냄
 * skip(long n) 스트림의 일부 건너뜀
 * peek(Consumer<T> action) 스트림의 요소에 특정 작업 수행
 * sorted()
 * sorted(Comparator<T> comparator) 스트림의 요소를 정렬
 */


public class Ex04_stream {
	public static void main(String[] args) {
		Integer[] nums = {1,44,33,21,36,68,88,4,5,6,1,1,1,2,2,2};
		
		//1.스트림 객체 만들기
		Stream<Integer> stream = Arrays.stream(nums);
		
		//2.중간연산
		stream.distinct().sorted().limit(5).forEach(x -> System.out.print(x + " "));
		System.out.println();
		System.out.println(Arrays.toString(nums));
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		//skip(n) 맨처음의 n개를 건너뛰고 시작
		//limit(n) n개의 개수를 갖는 스트림을 반환
		intStream.skip(3).limit(5).forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		IntStream intStream2 = IntStream.of(1,2,2,3,3,4,5,5,6,7,8,9,10);
		//2 4 6 8 10
		intStream2.distinct().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		//문자열의 길이가 3이상것만 출력
		Stream.of("ab","a","abc","abcd","abcdef","abcdefg").filter(x -> x.length() >= 3).forEach(x -> System.out.print(x + " "));
		
		
	}
}
