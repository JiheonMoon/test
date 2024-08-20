package ex01_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07_sum {
	public static void main(String[] args) throws IOException {
		//N개의 숫자가 공백없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하세요
		
		//입력 N개의 숫자 입력, 입력된 N개의 숫자만큼 숫자들이 공백없이 주어진다.
		
		//출력 입력으로 주어진 숫자 N개의 합을 출력
		
		//예시 5
		//54321
		//결과
		//15
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("자리수 입력 : ");
		int num = Integer.parseInt(buffer.readLine());
		int sum = 0;
		String[] str = null;
		while(true) {
			str = buffer.readLine().split("");
			
			if(str.length == num) {
				break;
			}
			System.out.println("자리수에 맞게 다시 입력해주세요");
		}
		for(String s : str) {
			sum += Integer.parseInt(s);
		}
		
		System.out.println("총합 : " + sum);
		
	}
}
