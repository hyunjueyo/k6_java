package Quiz;

public class Gugudan {

	public void print(int i) {
		System.out.println(i + "단");
		// 2*1=2 ...2*9=18
		for (int j = 1; j < 10; j++) {
			int result = i * j;
			System.out.println(i + "*" + j + "=" + result);
		}
	}
}