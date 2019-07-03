package ExceptionHandling;

public class demo {
	public static void main(String[] args) {
		int age = 1118;
		try {
			if (age > 110) {
				throw new NoSuchUserException();
			}
		} catch (NoSuchUserException e) {
			System.out.println("No user exhists");
		}
	}
}
