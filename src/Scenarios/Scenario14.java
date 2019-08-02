package Scenarios;

public class Scenario14 {
	public static int check(int a, int b) {
		int total = 0;
		try {
			total=a/0;
			return a - b;
		} catch (ArithmeticException e) {
			System.out.println("hi");
			return a * b;
		//	System.out.println("hi");
		} finally {
			return a + b;
		}
	}

	public static void main(String[] args) {
		System.out.println(check(5, 4));
	}
}
