package ex02_Thread;
/*
 * Thread에 이름 부여하기
 * 현재 진행중인 스레드가 어떤 작업을 하는지 알기 위해 스레드에 이름을 부여할수 있음
 * 우리가 생성한 스레드는 'Thread-N'이라는 이름으로 자동으로 설정되는데 다른이름으로 설정하고 싶다면 Thread 클래스의 setName()메서드를 사용한다.
 */
class WhiteFlag implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("백기 올려");
		}
		
	}
	
}


public class RunnableExample {
	public static void main(String[] args) {
		WhiteFlag wf = new WhiteFlag();
		//wf.start();
		Thread t = new Thread(wf);
		t.start();
		
		//Runnable 인터페이스를 익명클래스로 만들어서 람다식으로 표현
		Runnable blue = ()->{
			while(true) {
				System.out.println("청기 올려");
			}
		};
		
		Thread t2 = new Thread(blue);
		t2.start();
	}
}
