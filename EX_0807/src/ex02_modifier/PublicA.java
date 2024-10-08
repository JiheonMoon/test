package ex02_modifier;

/*
 * 제한자 - 클래스, 변수 또는 메서드의 선언부에 함께 사용해 부가적인 의미를 부여하는 키워드
 * 경우에 따라 여러개를 조합하여 사용할수 있지만, 접근 제한자의 경우 하나만 선택해서 사용해야함
 * 
 * 접근 제한자 - 클래스, 멤버(필드, 메서드)에 접근 가능한 범위를 제한하는 키워드
 * 객체 지향 프로그래밍의 특징중 한가지인 정보 은닉을 지키기 위한 중요한 부분
 * 
 * public : 제한 없이 모든 패키지, 모든 클래스에서 접근 가능
 * protected : 같은 패키지 안에서 접근 가능하며, 다른 패키지라도 자식 클래스라면 접근이 가능
 * default : 같은 패키지 내애서만 접근이 가능함
 * private : 같은 클래스 내에서만 접근이 가능함
 * 
 * 클래스의 접근 제한자 - 클래스는 접근제한자로 public과 default만 가질수있다.
 * private과 protected의 경우, 클래스 멤버들을 위한 접근제한자로 클래스 외부에서 접근을 막을지 말지 제한하는 용도로 사용되기 때문에 클래스의 접근제한자로 사용할수 없음
 * 
 * 객체지향의 특징
 * 캡슬화(getter&setter) - 객체 내부의 멤버(필드, 메서드)를 객체 외부에서 볼수 없도록 캡슐화 한다.
 * 접근이 필요한 경우 public 메서드를 활용해 접근하고, 이외의 값들은 모두 캡슐화를 통해 정보를 은닉한다.
 * 상속 - 미리 정의된 부모클래스의 멤버를 자식클래스가 물려받는다.
 * 다형성 - 하나의 방법으로 여러 객체를 호출하여 사용할 수 있다.
 * 추상화 - 공통된 기능과 정보를 추출해 객체화 한다.
 * 
 * default - 접근 제한자를 따로 명시하지 않는다면 클래스와 다른 멤버들은 자동으로 default를 가짐.
 * default로 선언된 클래스와 멤버들은 같은 패키지 안에서는 어디든지 접근 및 사용이 가능하나 다른 패키지에서는 접근이 불가능.
 * 
 * protected - 클래스 멤버를 위한 제한자로, 상속과 관련이 있는 제한자
 * default처럼 같은 패키지 안에서 접근과 사용을 허가하지만, 다른 패키지라도 "해당 패키지와 상속관계가 있는 자식클래스"라면 접근 및 사용이 가능
 * 
 * private - 가장 사용범위가 좁은 클래스 멤버를 위한 제한자.
 * 클래스가 public default이더라도, private로 선언된 멤버들은 클래스 외부에서 접근이 불가능함.
 * 오직 선언된 클래스 내부에서만 접근하여 사용가능.
 */
public class PublicA {
	public int a;
	
	private PublicA(int a) {
		this.a = a;
	}
	
	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메서드 호출");
	}
	
	DefaultC dc = new DefaultC(); //같은 패키지이기 때문에 객체생성 가능
	
	void methodA() {
		dc.variableC = 20; //public으로 선언된 필드이기 때문에 사용 가능
	}
}
