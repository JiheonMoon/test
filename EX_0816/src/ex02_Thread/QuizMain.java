package ex02_Thread;

import java.util.InputMismatchException;
import java.util.Scanner;

class QuizThread extends Thread{
	@Override
	public void run() {
		long beforeTime = System.currentTimeMillis();
		long afterTime = System.currentTimeMillis();
		long diffTime = (afterTime - beforeTime)/1000;
		System.out.println("결과 : " + diffTime + "초");
	}
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			int num1 = (int)(100*Math.random()) + 1;
			int num2 = (int)(100*Math.random()) + 1;
			while(true) {
				try {
					System.out.print(num1 + " + " + num2 + " = ");
					int res = sc.nextInt();
					if(res == num1 + num2) {
						break;
					} else {
						continue;
					}
				} catch (InputMismatchException e) {
					System.out.println("정수를 입력해주세요");
				}
			}
		}
		
	}
}

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
}
