package ex02_Thread;

class AddThread implements Runnable{
	
	private Bank b;
	private String name;
	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}
	
	
	@Override
	public void run() {
		synchronized (b) {
			try {
				for(int i = 0; i < 10; i++) {
					Thread.sleep(1000); //1초동안 멈춤
					b.addMoney(1000);
					System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}


public class BankThreadExample {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(new AddThread("1번", b));
		Thread t2 = new Thread(new AddThread("2번", b));
		
		t1.start();
		t2.start();
		

		/* 
		 * 2만원으로 나와야 정상. 실행 결과에 따라 더 적은 금액이 나올수 있음
		 * 그 이유는 두개의 스레드가 서로의 작업에 간섭하여 정상적으로 입금되지 않았기 때문
		 * 이러한 오류를 방지하기위해 여러스레드가 하나의 공유 데이터에 동시에 접근하지 못하도록 스레드의 실행을 제어하는 '스레드 동기화'가 필요
		 * 
		 * 스레드 동기화 처리
		 * 하나의 스레드가 이 영역에 진입할때 락을 걸어 다른 스레드가 수행되지 못하도록 하고 작업이 종료되면 락을 풀어 다른 스레드가 작업하도록 하는것
		 * 블록 또는 메서드 단위로 synchronized 키워드를 붙여 사용
		 * 
		 * 메서드 동기화 처리
		 * 메서드 이름 앞에 synchronized 키워드를 사용하면 해당 메서드 전체를 동기화 처리할수 있음
		 * 
		 * 블록 동기화 처리
		 * 메서드 동기화 처리의 경우 메서드 처리 시간이 길어질 경우 성능에 영향을 미치는 단점이 있음
		 * 이러한 이유로 전체 메서드가 아닌 특정 영역만 동기화 하는 것을 블록 동기화 처리라고 함
		 * 
		 * 스레드의 상태
		 * 스레드는 생성하고 실행, 종료 되기까지 다양한 상태를 가짐
		 * 각 스레드의 상태는 스레드 클래스에 정의되어 있으며, Thread.State 타입으로 알 수 있다.
		 * 스레드는 상태에 따라 6가지 타입으로 분류
		 * 
		 * 생성		NEW				스레드 객체가 생성되었지만 start()로 호출되지 않은 상태
		 * 대기		RUNNABLE		실행 대기 또는 실행상태로 언제로 갈수 있는 상태
		 * 일시정지	WATING			다른 스레드가 종료될때까지 대기하는 상태
		 * 			TIMED_WATING	주어진 시간 동안 대기하는 상태
		 * 			BLOCKED			락이 풀릴때까지 대기하는 상태
		 * 종료		TERMINATED		수행을 종료한 상태
		 * 
		 * sleep(int mils) - 주어진 시간 동안 스레드를 정지시키는 메서드
		 * 해당 기능은 모든 스레드를 대기시키며, 주어진 시간이 지나면 풀림
		 * 
		 * wait(), notify()
		 * 하나의 스레드가 완료되어야 다음 스레드가 동작할 수 있는 경우가 있다.
		 * wait() 메서드는 스레드를 대기시키고, notify() 메서드는 대기중인 스레드를 다시 동작시킬때 사용
		 */
	}
}
