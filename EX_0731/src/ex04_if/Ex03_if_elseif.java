package ex04_if;

public class Ex03_if_elseif {

	public static void main(String[] args) {
		/*
		 * if else if
		 * 비교해야할 조건이 여러개 있는 경우
		 * if문 안에 두개의 조건식과 논리연산자를 사용할수 있지만 간결하게하고 가독성을 높이기 위해 사용
		 * if(조건식1){
		 *   조건식1이 참일때 실행할 명령
		 * } else if(조건식2){
		 *   조건식2이 참일때 실행할 명령
		 * } else {
		 *   어떠한 조건도 거짓일때 실행할 명령
		 * }
		 */
		int favorite = 7;
		if(favorite < 5) {
			System.out.println("좋아하는 숫자는 5보다 작습니다.");
		} else if(favorite > 5) {
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		} else {
			System.out.println("좋아하는 숫자는 5입니다.");
		}
	}

}
