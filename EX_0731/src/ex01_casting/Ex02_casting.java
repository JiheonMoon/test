package ex01_casting;

public class Ex02_casting {

	public static void main(String[] args) {
		/*
		 * 강제 형변환 demotion
		 * 큰 컵의 물을 작은 컵에 옮겨 담는 것과 같음
		 * 보존될수도 있지만 넘칠수도 있음
		 * 큰 자료형에서 작은 자료형으로 옮길때 데이터 손실이 발생할수도 있다
		 * 데이터 손실이 일어난다면 정확한 연산이 불가능하므로 주의가 필요함
		 * (원하는 자료형)데이터or변수
		 */
		
		//int -> byte
		int i = 10;
		byte b = (byte)i;
		
		System.out.printf("i의 값 : %d, b의 값 : %d \n", i, b);
		
		//int -> byte(값이 큰경우)
		int j = 1000;
		byte c = (byte)j;
		
		System.out.printf("j의 값 : %d, c의 값 : %d \n", j, c);
	}

}
