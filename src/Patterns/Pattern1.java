package Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 10;
		// This line is for printing number of lines
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i + 1; space++) {
				System.out.print(" ");
			}
			int temp = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp--;
			}
			System.out.println();
		}
	}
}
