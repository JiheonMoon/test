package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> userList = new ArrayList<UserInfo>();
		
		Scanner sc = new Scanner(System.in);
		
		outer : while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			for(UserInfo user : userList) {
				if(user.getId().equals(id)) {
					System.out.println("아이디가 중복됩니다.");
					System.out.println("------------------------");
					continue outer;
				}
			}
			
			System.out.print("패스워드 입력 : ");
			int pwd = sc.nextInt();
			
			userList.add(new UserInfo(id, pwd));
			
			for(UserInfo user : userList) {
				System.out.println(user.getId());
				System.out.println(user.getPwd());
				System.out.println("------------------------");
			}
		}
		
	}
}
