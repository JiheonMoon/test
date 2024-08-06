package ex03_method;

public class CalcMain {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(1,2);
		
		int[] nums = {1,2,5,6,7,9};
		//필요에 따라 결과값은 변수에 저장하여 활용가능
		int n = calc.sum(nums);
		System.out.println("총합 : " + n);
	}
}
