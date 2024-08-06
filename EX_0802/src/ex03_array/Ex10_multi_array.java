package ex03_array;

import java.util.Scanner;

public class Ex10_multi_array {

	public static void main(String[] args) {
		//1~25까지 2차원배열 arr에 순차적으로 넣고 한줄에 다섯개씩 출력
		int[][] arr = new int[5][5];
		int count = 1; 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j] = count++);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		//로또번호 맞추기
		int[][] lotto = {{2,6,11,33,42,44}, {1,6,17,22,24,33},
				{7,9,16,24,33,45},{6,17,22,24,33,41}};
		
		//키보드에서 당첨숫자를 연속으로 6개를 입력받아 myNum에 넣는다.
		String myNum = "";
		boolean isWin = false;
		
		Scanner sc = new Scanner(System.in);
		
		//2차원에 들어있는 1차원 배열 5개중 하나라도 완전히 일치하는 곳이 있으면 당첨!, 아니면 당첨되지 못했습니다 출력
		for(int i = 1; i <= 6; i++) {
			System.out.printf("%d번째 번호를 입력하세요 : ", i);
			myNum += sc.next();
		}
		//문자열 비교는 equals
		for(int i = 0; i < lotto.length; i++) {
			String lottoNum = "";
			for(int j = 0; j < lotto[i].length; j++) {
				lottoNum += lotto[i][j];
			}
			if(lottoNum.equals(myNum)) {
				isWin = true;
				break;
			}
		}
		
		if(isWin) {
			System.out.println("당첨입니다");
		}else {
			System.out.println("당첨되지 못했습니다");
		}
		
	}
}


