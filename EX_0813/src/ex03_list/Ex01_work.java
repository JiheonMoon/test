package ex03_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
	public static void main(String[] args) {
		//아이디 생성 : abc
		//abc
		//아이디 생성 : abc2
		//abc abc2
		//아이디 생성 : abc2
		//중복된 아이디
		//아이디 생성 : abc3
		//abc abc2 abc3
		//리스트의 요소의 개수가 4개이면 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		outer : while(list.size() != 4) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			//리스트에 중복이 되는 아이디가 있는지 검증
			
//			for(String s : list) {
//				if(s.equals(id)) {
//					System.out.println("중복된 아이디");
//					System.out.println("-------------------");
//					continue outer;
//				}
//			}
			
			if(list.contains(id)) {
				System.out.println("중복된 아이디");
				System.out.println("-------------------");
				continue;
			}
			
			list.add(id);
			
			System.out.println(list);
			
			System.out.println("-------------------");
		}
		
	}
}
