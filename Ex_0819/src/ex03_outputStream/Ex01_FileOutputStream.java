package ex03_outputStream;

import java.io.FileOutputStream;

/*
 * OutputStream
 * 바이트 기반의 출력 스트림은 최상위 클래스로 OutputStream 객체가 제공된다
 * 해당 객체를 상속해 다양한 출력 스트림들이 존재한다.
 * 
 * OutputStream의 주요 메서드
 * int write(int b) 1byte 출력
 * int write(byte[] b) 매개변수로 주어진 배열의 모든 바이트 출력
 * int write(byte[] b, int offset, int len) 매개변수로 주어진 배열에 정해진 범위만큼 읽어서 출력(offset 시작위치, len 길이)
 * int flush() 출력 버퍼에 잔류하는 모든 내용 출력
 * close() 스트림 사용을 종료하고 자원을 반환
 * 
 * FileOutputStream
 * 파일을 쓸때 기존 파일명이 존재하는 경우가 있다
 * 이때 해당 파일의 내용을 유지한채 이어쓰거나 기존의 내용을 무시하고 새롭게 파일을 생성할수 있다.
 */
public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		try {
			//이어쓰고 싶다면 FileOutputStream에 생성자에 두번째 인자로 true를 전달
			//파일이 없으면 직접 만들어준다
			//확장자를 마음대로 지정가능
			FileOutputStream fos = new FileOutputStream("D:\\web0900_mjh\\1.java/fileOut.html");
			
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			
			
			String msg = "\nfileOutput 예제입니다\n";
			String msg2 = "여러줄도 가능\n";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch (Exception e) {
			
		}
	}
}
