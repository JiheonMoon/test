package ex01;

public class Ex03 {
	public static void main(String[] args) {
		int money = 10 * ((int)(500 * Math.random()) + 1);
		System.out.println(money + "원");
		
		int[] coins = {500, 100, 50, 10};
		
		for(int coin : coins) {
			System.out.printf("%d원 : %d개\n", coin, money / coin);
			money %= coin;
		}
		
	}
}
