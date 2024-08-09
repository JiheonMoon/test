package ex02_inner;
/*정적 내부 클래스(static class)
* 클래스 안에서도 정적변수를 선언할수 있는것처럼 클래스도 정적 내부 클래스를 만들수 있음
* 필드와 마찬 가지로 static 키워드를 사용해 클래스를 선언한 후 정적 내부 클래스를 생성한다
* 주로 외부 클래스의 static메서드에서 사용될 목적으로 만든다.
* 
* public class Outer{
* 	private String name;
* 	public static class Inner{
* 		private String name;
* 	}
* }
* 외부 클래스의 필드 또는 메서드를 정적 내부 클래스 안에서는 사용할수 없다
* public class Outer{
* 	private int val1;
* 	public static class Inner{
* 		public void add(){
* 			int result = val1 + 10; //오류
* 		}
* 	}
* }
* 
* 정적 내부 클래스는 정적 변수 또는 정적 메서드를 호출하는것은 가능
* 
* public class Outer{
* 	private int val;
* 	private static int cnt = 1;
* 	public static class Inner{
* 		public void displayOuterInfo(){
* 			System.out.println(val) //에러
* 			System.out.println(cnt) //가능
* 		}
* 	}
* }
* 
* 정적 내부 클래스의 객체 생성
* Outer.Inner in = new Outer.Inner();
*/



class PrintOut{
	public static class Out{
		public void println(String str) {
			System.out.println(str);
		}
	}
}


public class StaticClassExample {
	public static void main(String[] args) {
		String str = "정적 내부 테스트";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
	}
}
