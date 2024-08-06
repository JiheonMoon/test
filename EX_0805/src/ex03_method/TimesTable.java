package ex03_method;

public class TimesTable {
	//showTable() - 구구단을 출력하는 코드 작성
	//TimesTableMain 클래스에서 키보드에서 정수를 하나 입력받아 입력받은 정수의 구구단을 출력하기
	void showTable(int num){
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
}
