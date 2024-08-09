package ex04_exception;

public class Ex03_Exception {
	public static void main(String[] args) {
		//ArrayIndexOutofBoundsException
		//배열에서 index 범위를 초과해 사용할때 발생
		int[] arr = {1,5,6,7,8};
		System.out.println(arr[6]);
	}
}
