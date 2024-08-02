package ex03_array;

public class Ex02_Array {

	public static void main(String[] args) {
		int [] arr = new int [4];
//		arr[0] = 100;
//		arr[1] = 200;
//		arr[2] = 300;
//		arr[3] = 400;
//
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);

		
		for(int i = 0; i < 4; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println(arr[i]);
		}
		
		//배열의 길이 - 배열을 생성할때 []안에 배열의 길이를 작성함. 배열을 사용하면서 종종 배열의 길이가 필요할때가 있음
		//배열은 내부적으로 length라는 변수를 지니는데, 해당변수가 길이값을 가지고 있음.
		//배열명.length - 배열이 생성될때 지졍되며 변경 x
		
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
