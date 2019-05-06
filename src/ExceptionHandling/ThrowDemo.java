package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
	private final String uname = "TestUser";
	private final String pass = "Test@123";
	private Scanner sc;

	public boolean isAuthenticUser(String username, String password) {
		return username.equals(uname) && password.equals(pass);
	}

	public void addUser() throws NoSuchUserException {
		sc = new Scanner(System.in);
		int attempt = 0;
		while (true) {
			System.out.println("Enter username and password seperated with space");
			String uname = sc.next();
			String pass = sc.next();
			if (isAuthenticUser(uname, pass)) {
				System.out.println("Welcome " + uname + "You can add accounts");
				break;
			} else {
				System.err.println("Incorrect username or password Please try again");
				System.out.println();
				attempt++;
			}
			if (attempt == 3) {
				throw new NoSuchUserException();
				//Throw keyword is used to explicitly throw an exception.
			}
		}
	}

	public static void main(String[] args) throws NoSuchUserException {
		ThrowDemo d = new ThrowDemo();
		d.addUser();
	}
}
//10832600