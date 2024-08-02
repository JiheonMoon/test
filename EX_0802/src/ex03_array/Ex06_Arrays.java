package ex03_array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ex06_Arrays {
	public static void main(String[] args) {
		//Arrays 클래스 - 배열의 복사, 항목정렬, 항목검색 등 다양한 메서드 제공
		//Arrays 클래스를 사용하면 배열의 기능을 더 쉽게 사용 가능
		//배열의 출력 - toString() 반복문의 도움 없이 배열을 출력할수 있도록 문자열 형태로 변환하여 출력
		
		int[] arr = {1,6,2,3,10,7,5,4,9,8};
		System.out.println(Arrays.toString(arr));//Arrays는 import는 해야함 객체생성은 안함
		
//		//Scanner는 import도 하고 객체생성도 함
//		Scanner sc= new Scanner(System.in);
//		Random rnd = new Random();
//		//import도 안하고 객체생성도 안함
//		Math.random();
		
		//배열의 정렬 - sort() : 배열을 오름차순으로 정리해주는 메서드
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
		//내림차순 정렬
		//기존 자료형의 배열로는 내림차순으로 정렬이 불가능하다
		//기본자료형의 클래스타입이 필요
		//int ->Integer
		Integer[] arr2 = {1,6,2,3,10,7,5,4,9,8};
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
	}
}
