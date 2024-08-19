package ex03_outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\web0900_mjh\\1.java/wall.jpg");
			out = new FileOutputStream("D:\\web0900_mjh\\1.java/wall_copy2.jpg");
			byte[] buffer = new byte[512];
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			while((read = in.read(buffer)) != -1) {
				//바로 써줌
				out.write(buffer,0,read);
				
			}
			
			long end = System.currentTimeMillis();
			double time = (end - start) / (double)1000;
			System.out.println(time + "초 걸렸습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(out != null) {
					out.close();
				}
				
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				
			}
		}
		
		//읽자마자 쓰는것보다 중간에 버퍼라는 공간을 두는것이 속도가 훨씬빠름
		
	}
}
