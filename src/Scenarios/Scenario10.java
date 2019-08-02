package Scenarios;

import java.io.IOException;

public class Scenario10 {
	public static void main(String[] args) throws IOException {
		try {
			int a = 10;
			int b = 0;
			int res = a / b;
		} catch (ArithmeticException e) {
			System.err.println("Catch 2");
			System.exit(0);
		} finally {
			System.out.println("finally");

		}
	}
}
