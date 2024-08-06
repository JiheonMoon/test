package ex03_method;

import java.util.Arrays;

public class MethodTest {
	//배열의 최대값을 찾아 출력하는 maxFinder 메서드 작성
	//배열은 매개변수로 전달받음
	
	void maxFinder(int[] nums) {
//		int max = nums[0]; 
//		for(int i : nums) {
//			if(i > max) {
//				max = i;
//			}
//		}
		Arrays.sort(nums);
		int max = nums[nums.length - 1];
		System.out.println("배열의 최대값은 " + max +"입니다.");
	}
	
	
	//계산기 만들기
	//Main에서 숫자 두개랑, 산술연산자를 전달받아서 계산을 해서 반환하는 getResult()메서드 작성
	int getResult(int x, int y, String oper) {
		int result = -1;
		switch(oper) {
		case "+" -> result = x + y;
		case "-" -> result = x - y;
		case "*" -> result = x * y;
		case "/" -> result = x / y;
		case "%" -> result = x % y;
		default -> System.out.println("연산자가 올바르지 않습니다.");
		}
		return result;
	}
	
	
	
	
}
