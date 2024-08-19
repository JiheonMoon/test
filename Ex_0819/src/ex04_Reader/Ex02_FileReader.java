package ex04_Reader;

import java.io.FileReader;

public class Ex02_FileReader {
	public static void main(String[] args) {
		//특정 경로에 reader.txt 파일을 만들고 아무 내용이나 적는다.
		//reader.txt 파일을 읽어서 알파벳 대문자와 소문자의 개수를 출력하세요
		
		//대문자 : X개
		//소문자 : X개
		
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\web0900_mjh\\1.java/reader.txt");
			int code = 0;
			int upper = 0;
			int lower = 0;
			
			while((code = fr.read()) != -1) {
				
				if(code >= 'A' && code <= 'Z') {
					upper++;
				} else if(code >= 'a' && code <= 'z'){
					lower++;
				}
				System.out.print((char)code);
			}
			System.out.println();
			
			System.out.printf("대문자 : %d개\n",upper);
			System.out.printf("소문자 : %d개",lower);
		} catch (Exception e) {
			
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				
			}
		}
	}
}
