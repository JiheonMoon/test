package ex02_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		//특정 경로에 file.txt 문서를 만들고 아무 문장이나 입력해둔다
		//file.txt의 내용을 읽어온뒤, 회문인지 아닌지 판별해서 출력하시오
		String path = "D:\\web0900_mjh\\1.java/file.txt";
		File f = new File(path);
		byte[] b = new byte[(int) f.length()];
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(f);
			fis.read(b);
			String ori = new String(b);
			String rev = new StringBuffer(ori).reverse().toString();
			if(ori.equals(rev)) {
				System.out.println(ori + "는 회문입니다.");
			} else {
				System.out.println(ori + "는 회문이 아닙니다.");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
