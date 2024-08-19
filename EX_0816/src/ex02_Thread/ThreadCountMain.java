package ex02_Thread;

import java.util.Scanner;

class ThreadCount extends Thread{
	private int count;
	
	public ThreadCount(int count) {
		this.count = count;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				count--; 
				System.out.println("count : " + count);
				if(count == 0) {
					System.out.println("종료");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}



public class ThreadCountMain {
/*
 * 스캐너를 통해 숫자를 입력받고
 * 스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을때 "종료"라는 메시지와 함게 스레드 종료
 * ThreadCount 클래스에 스레드 정의하기
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		ThreadCount tc = new ThreadCount(sc.nextInt());
		tc.start();
	}
}
