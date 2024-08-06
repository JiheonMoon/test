package ex03_method;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		//Graph라는 클래스에 main()메서드를 만들고 0~9 사이의 난수를 100개 저장하는 배열을 만들고, 해당 배열이 갖고있는 방의 난수를 판별하여 그래프화 해보자
		//단, 발생한 난수의 그래프화 작업은 PrintGraph클래스에서
		int[] arr = new int[100];
		Random rnd = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(10);
			System.out.print(arr[i]);
		}
		
		int[] nums = new int[10];
		for(int i : arr) {
			nums[i]++;
		}
		System.out.println();
		PrintGraph p = new PrintGraph();
		p.makeGraph(nums);
	}
}
