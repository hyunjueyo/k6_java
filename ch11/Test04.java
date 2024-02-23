package com.ruby.java.ch11;

import java.io.FileInputStream;

//import java.io.*; 전체 다 쓰겠다는 의미. 이렇게 쓰지마세요

public class Test04 {
	
	public static void test() throws Exception {
			FileInputStream fi = new FileInputStream("a1.txt"); //a.
			int c = fi.read();
			System.out.println((char) c); 
			
	}

//	첫번째 방법 (test(); 빨간줄 그어진 거 누르면 2가지 방법 나옴)
//	public static void main(String[] args) throws Exception {
//		System.out.println("start");
//		test();
//		System.out.println("end");
//	}
//}
	
	//두번째 방법
	public static void main(String[] args) {
	System.out.println("start");
	try {
		test();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("end");
	}
}