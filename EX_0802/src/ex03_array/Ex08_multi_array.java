package ex03_array;

import java.util.Arrays;

public class Ex08_multi_array {
	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * 2차원 이상의 배열을 의미하며, 배열의 요소로 또다른 배열을 가지는것을 의미함
		 * 2차원 배열은 배열의 요소로 1차원 배열을 가지고, 3차원은 2차원 배열을 가짐
		 */
		
		//2차원 배열의 생성
		//자료형 [][] 배열명 = new 자료형[크기][크기];
		int[][] arr = new int[3][2];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[1][0] = 300;
		arr[1][1] = 400;
		arr[2][0] = 500;
		arr[2][1] = 600;
		
		int[][] arr2 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(arr2));
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//2차원 배열 iArr에 있는 총합구하기
		int [][]iArr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				sum += iArr[i][j];
			}
		}
		System.out.println("총합 : " + sum);
	}
}
