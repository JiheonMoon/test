package ex03_method;

public class Bread {
	
	void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	
	void makeBread(int amount) {
		for(int i = 0; i < amount; i++) {
			this.makeBread();
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n" , amount);
	}
	
	void makeBread(int amount, String name) {
		for(int i = 0; i < amount; i++) {
			System.out.print(name);
			this.makeBread();
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n" , amount, name);
	}
	
}
