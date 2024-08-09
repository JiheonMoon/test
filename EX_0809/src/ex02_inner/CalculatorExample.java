package ex02_inner;
/*
 * 내부 클래스
 * 클래스 안에 만들어진 또다른 클래스로 중첩클래스라고도 한다
 * 클래스안에 다른 클래스를 선언하는 이유는 두개의 클래스가 서로 긴밀한 관계를 맺고있기 때문
 * 
 * 내부클래스의 장점
 * 두클래스의 멤버들간에 손쉽게 접근할수 있음
 * 불필요한 클래스를 감춰 코드의 복잡성을 줄임
 * 외부 클래스{
 * 		내부클래스{
 * 			
 * 		}
 * }
 * 
 * 내부클래스의 종류
 * 
 * 인스턴스 클래스 - 외부클래스의 필드와 같은 위치에 선언
 * 주로 외부클래스의 클래스 멤버 변수와 관련된 작업에 사용될 목적
 * 
 * 정적 클래스 - 클래스의 클래스변수처럼(정적변수) 내부클래스에 static을 붙인 클래스
 * 
 * 지역 클래스 - 외부클래스의 메서드 내부에서 선언하여 사용
 * 메서드 영역에서 선언되기 때문에 메서드 내부에서만 사용이 가능
 * 
 * 인스턴스 클래스 - 외부 클래스 내부에서 생성하고, 선언되어 사용하는 클래스
 * 외부 클래스와 필드와 같은 위치에서 선언하며, 외부클래스의 필드처럼 다뤄짐
 * 주로 외부클래스의 필드들과 관련된 작업에 사용될 목적으로 사용
 * 
 * 외부 클래스{
 * 		Private String name;//필드
 * 		내부클래스{
 * 			private int age;//내부 필드
 * 		}
 * }
 * 
 * 내부 클래스도 외부 클래스 안에 생성되는 것 외에는 별도의 클래스이기 때문에, 파일이 컴파일되면 별도로 생성된다.
 * 
 * 인스턴스 클래스의 객체화
 * 인스턴스 클래스는 기본적인 내부클래스이다.
 * 외부 클래스 안에서 생성되기 때문에, 클래스를 사용하려면 외부클래스의 객체가 생성된 상태에서 객체를 생성 할 수 있다.
 * 
 * Outer outer = new Outer(); //외부클래스 객체생성
 * 
 * Outer.Inner inner = outer.new Inner();
 */
class Calculator{
	private int val1;
	private int val2;
	
	//객체를 만들때 1번밖에 쓸수 없다
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	//다시 다른값을 대입하고 싶다면 setter를 만드는 것이 좋음
	
	public class Calc{
		public int add() {
			return val1 + val2;
		}
	}
}

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator(10, 11);
		Calculator.Calc c = cal.new Calc();
		System.out.println("결과 : " + c.add());
	}
}
