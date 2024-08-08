package ex05_abstract;

public class ReceiptMain {
	public static void main(String[] args) {
		//Receipt r = new Receipt("춘식"); 추상클래스는 직접 개체를 생성할수 없음.
		
		PastaReceipt pr = new PastaReceipt("최연석");
		pr.info(); //자식객체를 통해 추상클래스의 메서드를 호출할수 있음
		pr.makeSource(); 
		
		StakeReceipt sr = new StakeReceipt("이현복");
		sr.info();
		sr.grillStake();
	}
}
