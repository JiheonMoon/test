package ex02_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 입출력 스트림
 * 자바의 입출력은 java.io 패키지에서 제공한다
 * java.io 패키지에서는 파일 시스템의 정보를 얻기 위해 File클래스와 데이터 입출력을 위한 다양한 클래스를 제공한다
 * 스트림의 종류를 크게 분류하면 전달 방식에 따라 byte 기반 스트림과 char 기반 스트림으로 구분한다
 * 바이트 기반의 스트림은 데이터를 컴퓨터의 기본 당뉘인 바이트 단위로 나눠 읽거나쓰고
 * 문자기반의 스트림은 텍스트 기반 문서를 다루기 위해 사용
 * 
 * 바이트 기반의 스트림
 * 컴퓨터의 모든 데이터는 바이트 단위로 이루어져 있다
 * 따라서 바이트 기반 스트림의 경우 모든 타입 데이터를 읽고 쓰는 것이 가능하다.
 * 바이트 기반의 스트림은 바이트 입력 스트림과 바이트 출력 스트림이 있다.
 * 
 * InputStream
 * 바이트 기반의 입력 스트림은 최상위 클래스로 InputStream 객체가 제공된다
 * 해당 객체를 상속해 다양한 입력 스트림이 존재한다
 * 각자의 개발 목적에 맞게 선택하여 사용할 수 있다.
 * 
 * InputStream의 주요 메서드
 * int read() 문자를 1byte씩 읽고 반환, 더이상 읽을 문자가 없으면 -1을 반환
 * int read(byte[] b) 매개변수로 전달된 배열에 읽어온 문자를 저장하고 실제 읽어온 수만큼 반환, 더이상 읽을 문자가 없으면 -1을 반환
 * int read(byte[] b, int offset, int len) 매개변수로 전달된 배열에 정해진 범위만큼 읽어서 저장(offset 시작 위치, len 길이)
 * int available() 스트림으로부터 읽어올수 있는 데이터의 크기를 반환
 * close() 스트림 사용을 종료하고 자원을 반환
 * 
 * FileInputStream
 * 파일을 바이트 단위로 읽어들일때 사용하는 스트림
 * 이미지 동영상 텍스트 등 모든 타입의 파일을 읽어올수 있다.
 */
public class Ex01_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\web0900_mjh\\1.java/test.txt";
		
		File f = new File(path);
		
		FileInputStream fis = null;
		
		//경로가 이상이 없는지, 존재하는지 검증을 하고 이상이 없으면 읽어와라
		if(f.exists()) {
			try {
				
				fis = new FileInputStream(f);
				
				//한 바이트씩 읽어와서 담아줄 변수
				int code = 0;
				
				//read()메서드가 글자를 읽어오는 작업을 함
				//read()메서드는 텍스트를 읽어올 때 1바이트씩밖에 읽어올수 없기 때문에 한글데이터 읽는게 불가능(한글은 2~3byte)
				while((code = fis.read()) != -1) {
					//더이상 읽어올 단어가 없으면 문장의 끝(End of File)인 -1을 반환함
					//아스키 코드, 유니코드 어느곳에서도 -1은 의미가 없기 때문
					System.out.print((char)code);
				}
				//스트림은 사용이 완료된 이후 close를 통해 닫아주는것이 좋음
				//그래야 다음이 작업시 문제가 생기지 않음
				//close를 작성하지 않았을때 아직 할 작업이 남았다고 생각할수도 있기 때문에 화면에 띄우거나 파일을 안만드는 착각을 할수있음
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					//잘 읽어오던 읽어오지 못하던 무조건 닫아야함
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
