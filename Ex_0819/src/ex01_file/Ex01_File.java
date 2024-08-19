package ex01_file;

import java.io.File;

/*
 * 파일 입출력
 * 프로그램은 데이터를 외부에서 입력받아 처리하고 출력하는 구조로 되어있다.
 * 프로그램으로 들어오는 모든 값을 Input 이라고 함
 * 프로그램을 나가는 모든 값을 Output 이라고 함
 * 자바에서는 입출력을 처리하기 위해 별도의 I/O패키지를 제공함
 * 데이터는 자바에서 처리할수 있는 모든것을 의미함
 * 디스크상에 존재하는 데이터일수도 있고, 키보드나 마우스와 같은 외부 입력장치에서 입력되는 데이터일수도 있고, 인터넷을 통해 전송되는 데이터일수도 있다.
 * 자바가 디스크 접근해 데이터를 주고 받는 작업을 도와주는 통로는 '스트림'이라고 함
 * 
 * File 클래스
 * 파일 또는 폴더에 대한 정보를 제공하는 클래스
 * 경로명, 파일 크기, 타입, 날짜 등의 속성 정보를 제공함
 * 파일 생성, 삭제, 이름 변경 등 파일 관리 작업을 지원하기 위한 메서드로 구성
 */
public class Ex01_File {
	public static void main(String[] args) {
		String path = "D:\\web0900_mjh\\1.java/test.txt";
		
		File f= new File(path);
		
		System.out.println(f.length() + "byte");
	}
}
