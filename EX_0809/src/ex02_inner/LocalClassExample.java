package ex02_inner;

/*
 * 지역 클래스
 * 외부클래스의 메서드 안에서 선언하여 사용하는 클래스
 * 메서드 내에서 선언되기 때문에 해당 클래스드는 메서드 내에서만 사용할 수 있다.
 * 메서드의 실행이 끝나면 해당 클래스도 사용이 종료됨
 * 
 * public class LocalClass{
 * 		public void print(){
 *
 * 						class A{
 * 						}
 * 						A a = new A();
 * }
 */
public class LocalClassExample {
	private int speed = 10;
	
	public void getUnit(String unitName) {
		//unitName += "님";
		class Unit{
			public void move() {
				//자바 7까지는 지역클래스에서 메서드의 변수를 사용하려면 final 키워드를 붙여서 사용하도록 했으나
				//자바 8부터는 해당 변수를 변경하지 않는다는 조건하에 effective final이라는 기능이 추가되어 키워드를 사용하지 않아도 final 변수로 인정된다.
				System.out.println(unitName + "이 " + speed + "의 속도로 이동합니다");
			}//move
		}//Unit
		Unit unit = new Unit();
		unit.move();
	}//getUnit
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
}
