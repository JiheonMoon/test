package ex01_buffered;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * 문자 변환 보조스트림
 * 바이트 기반 스트림으로 텍스트 파일을 읽거나 쓸경우, 한글을 포함한 비영어권 문자들이 정상적으로 출력되지 않는 모습을 보았다
 * 소스 스트림이 바이트 기반이고, 입출력 데이터 문자라면 Reader로 변환하여 사용하는것을 고려해 봐야한다.
 * 
 * InputStreamReader
 * 바이트 기반의 스트림 InputStream을 문자 기반의 스트림 Reader로 변환하는 보조스트림
 * 
 */
public class Ex04_InputStreamReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("D:\\web0900_mjh\\1.java/test.txt");
			is = new InputStreamReader(in, "UTF-8");
			int read = 0;
			
			while((read = is.read())!= -1) {
				System.out.print((char)read);
			}
			//예외 발생시 catch로 가기 때문에 close가 안됨
//			is.close();
//			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(is != null) is.close();
				if(in != null) in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
