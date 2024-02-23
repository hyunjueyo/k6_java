package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	
//	public static void main(String[] args) throws FileNotFoundException, IOException {
//		try(FileInputStream fi = new FileInputStream("a.txt")){
//			int c = fi.read();
//			System.out.println((char) c); //H 출력
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fi = new FileInputStream("a.txt")){
			int c;
			while((c = fi.read()) != -1) { //fi 파일 읽어서 c가 -1이 아니면
//				System.out.println((char) c); Hello나오는 거
				System.out.print(c + ",");
				System.out.println((char) c);
			}
		}catch (IOException e) { //파일이 없거나 할 때 여기로 옴
			e.printStackTrace();
		}
	}
}