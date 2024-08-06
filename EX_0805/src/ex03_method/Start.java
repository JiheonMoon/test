package ex03_method;

import java.util.Random;

public class Start {
	//Start 클래스를 생성하고 1~50사이의 난수를 발생시킨다
	//StartMain 클래스를 만들고 사용자가 키보드를 통해 정수를 입력받는다
	//Start클래스에서 사용자가 입력한 숫자를 판단하여 발생한 난수보다 크다면 Down! 작다면 Up!을 출력
	//만약 입력한숫자와 난수가 같을경우 프로그램을 종료시켜며 몇회만에 정답을 맞추는지 카운트
	Random rnd = new Random();
	int num = rnd.nextInt(50)+1;
	boolean isOk = false;
	
	void findNumber(int n) {
		if(num < n) {
			System.out.println("Down!");
		}
		else if(num > n) {
			System.out.println("Up!");
		}
		else {
			System.out.println("Correct!");
			isOk = true;
		}
	}
	
}
