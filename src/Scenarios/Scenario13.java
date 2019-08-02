package Scenarios;

public class Scenario13 {
	public static void main(String[] args) throws Exception {
		m1();
	}

	private static void m1() throws Exception {

		m2();
	}

	private static void m2() throws ArrayIndexOutOfBoundsException {

		m3();
	}

	private static void m3() throws IndexOutOfBoundsException {

		try {
			m4();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void m4() throws StackOverflowError {

		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
