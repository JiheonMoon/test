package ex07_test;

public class GoodCalc extends Calculator {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int substract(int x, int y) {
		return x - y;
	}

	@Override
	public double average(int[] nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return (double)sum / nums.length;
	}

}
