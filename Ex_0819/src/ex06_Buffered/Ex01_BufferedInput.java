package ex06_Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * 보조 스트림
 * 스트림은 기능에 따라 기반스트림과 보조스트림으로 구분한다
 * 기반 스트림: 대상에 직접 읽고 쓰는 스트림
 * 보조 스트림: 직접 읽고 쓰는 기능 없이 기반 스트림에 추가로 사용할수 있는 스트림
 * 
 * 보조스트림 만으로는 데이터를 주고 받을수 없다.
 * 스트림의 기능을 향상시키거나 새로운 기능을 제공해주는 스트림으로 여러 보조스트림을 중첩하여 사용하는것은 가능하다
 * 
 * 보조 스트림 사용법
 * 보조스트림을 사용하려면 기반 스트림을 먼저 선언해야 한다
 * 보조스트림 변수명 = new 보조스트림(기반스트림 객체);
 * 
 * 성능 향상 보조스트림
 * 느린 하드디스크와 네트워크는 입출력 성능에 영향을 준다
 * 이때 입출력 소스와 직접 작업하지 않고 버퍼라는 메모리를 이용해 작업을 하면 실행성능을 향상시킬수 있음
 * 하지만 버퍼의 크기는 작아 많은 양의 데이터를 처리하기엔 부족함
 * 보조 스트림중에는 메모리 버퍼를 추가로 제공하여 스트림의 성능을 향상시켜주는 것들이 있다
 * 
 * 바이트기반의 스트림
 * BufferedInputStream, BufferedOutputStream
 * 
 * 문자기반의 스트림
 * BufferedReader, BufferedWriter
 */
public class Ex01_BufferedInput {
	public static void main(String[] args) {
		FileInputStream in = null;
		BufferedInputStream bis = null;
		try {
			in = new FileInputStream("D:\\web0900_mjh\\1.java/reader.txt");
			bis = new BufferedInputStream(in);
			int code = 0;
			while((code = bis.read()) != -1) {
				System.out.print((char)code);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(bis != null) bis.close();
				if(in != null) in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
