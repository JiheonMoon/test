package ex07_test;

public class Main {
	public static void main(String[] args) {
		//추상클래스는 직접 객체화할수 없음
		GoodCalc gc = new GoodCalc();
		System.out.println("6 + 7 = " + gc.add(6, 7));
		System.out.println("6 - 7 = " + gc.substract(6, 7));
		int[] nums = {3,7,9};
		System.out.printf("average : %.2f\n", gc.average(nums));
	}
}

