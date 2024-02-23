package com.ruby.java.ch11;

public class Test05_1 {
//try-catch를 main으로 옮겨보세요
	int battery = 0;

	public void charge(int time) throws Exception {

		if (time < 0) {
			time = 0;
			throw new NagativeNumberException();
		
		}
		battery += time;
		battery += time;
		System.out.println("현재 배터리 : " + battery);

	}

	public static void main(String[] args) {

		Test05 test = new Test05();
		try { //똑같은 메소드니까 같이 묶어줘도 된다.
			test.charge(30);
			test.charge(20);
			test.charge(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}