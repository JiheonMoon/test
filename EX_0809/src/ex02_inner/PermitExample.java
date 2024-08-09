package ex02_inner;
/*
 * 내부 클래스의 접근 제한 - 내부 클래스도 클래스이기 때문에 접근 제한자를 붙여 사용할수 있다.
 * 지역클래스의 접근 제한 - 지역 클래스는 메서드 내에서 선언되어 사용한다
 * 보통 메서드가 종료되면 클래스도 함게 종료되지만 메서드와 실행되는 위치가 다르기 때문에 종료되지 않고 남아있을수도 있다.
 * 그래서 지역클래스에서 메서드 내의 변수를 사용할대는 변수를 복사해 사용한다.
 * 이런 이유로 지역클래스에서 메서드의 변수를 사용할때 변수가 변경되면 오류가 발생함
 */
public class PermitExample {
	private class InClass{
		public void print() {
			System.out.println("접근을 private로 제한합니다.");
		}
	}
	
	public InClass getInClass() {
		return new InClass();
	}
	
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		permit.getInClass().print();
	}
}
