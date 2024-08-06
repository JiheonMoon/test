package ex03_method;

public class PrintGraph {
	
	void makeGraph(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print( i + "의 갯수 : ");
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" " + arr[i]);
		}
	}
}
