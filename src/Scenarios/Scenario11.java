package Scenarios;

public class Scenario11 {
	public static void main(String[] args) {
		try {
			System.out.println("A");
			throw new NullPointerException("Hello");
		} catch (NullPointerException e) {
			System.out.println("B");
		}
	}
}
