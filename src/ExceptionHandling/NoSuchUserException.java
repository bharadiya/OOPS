package ExceptionHandling;

public class NoSuchUserException extends Exception {
	public String toString() {
		return "You have exceeded the limit of Login. Please contact Administrator or your respective home branch.";
	}
}
