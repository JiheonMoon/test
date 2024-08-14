package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bingo {
	public static void main(String[] args) {
		//HashSet과 ArrayList를 이용하여 5*5 랜덤 빙고판 만들기
		//1~50 의 난수중 25개를 넣기
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//Collections.shuffle(list)
		
		Set<Integer> set = new HashSet<>();
		while(true) {
			set.add((int)(Math.random()*50)+1);
			if(set.size() == 25) {
				break;
			}
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		
		int[][] bingo = new int[5][5];
		int index = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				bingo[i][j] = list.get(index++);
				System.out.printf("%02d ",bingo[i][j]);
			}
			System.out.println();
		}
		
	}
}
