package ex03_variable;

public class Ex_PrintData {
	public static void main(String[] args) {
		//정수형:소수점이 없는 숫자
		//실수형:소수점이 있는 숫자
		//문자형:홑따옴표 한글자
		//문자열:큰따옴표 글자
		
		//문자열 앞뒤에 오는 더하기는 연결의 의미
		System.out.println("안녕하세요"+5);
		
		System.out.println(5+10+":"+5+10);//15:510 
		System.out.println(5+10+":"+(5+10));//15:15
		System.out.println("2+2="+2+2); //22
		System.out.println("2+2="+(2+2)); //4
	
	}
}
