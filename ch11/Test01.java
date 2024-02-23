package com.ruby.java.ch11;

public class Test01 {
	
//	public static void main(String[] args) {
//		try {
//			String s = new String("java");
//			int len = s.length();
//			s = null; 
//			s.length(); //s가 null이니까 이 시점에 프로그램 종료
//			int arr[] = new int[3]; //이 시점에 프로그램 종료되니까 try-catch 추가
//			arr[3] = 30;
//			System.out.println("ok");
//		} catch(ArrayIndexOutOfBoundsException e1) {
//			System.out.println(e1.getMessage());
//		} catch(NullPointerException e2) {
//			e2.printStackTrace();
//		} catch(Exception e) {
//			System.out.println("오류 발생 : " + e);
//		} 
//		System.out.println("good");
//	}
//}
	
	public static void main(String[] args) {
		test1();
		System.out.println("good");
	}
	
	private static void test1() {
		System.out.println("test1 start");
		test2();
		System.out.println("test1 end");
	}
	private static void test2() {
		System.out.println("test2 start");
		try {
			int temp = 10/0; //예외를 처리할 수 있는 게 없으니까 Exception으로 가서 처리함.
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("ok");
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}catch(NullPointerException e2) {
			e2.printStackTrace();
		}catch(Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("test2 end");
	}
}	
	