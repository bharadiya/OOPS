package Patterns;

public class Box {
	public static void main(String[] args) {
		int lines = 4;
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= lines - i + 1; j++) {
				System.out.print(j+" ");
			}
			for (int star = 1; star <= 2 * (i - 1); star++) {
				System.out.print("* ");
			}
			for (int j = lines - i + 1; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
}
