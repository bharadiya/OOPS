package Patterns;

public class Patternusingwhile {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n - i) {
				System.out.print(" ");
				j++;
			}
			int k = 1;
			while (k <= i) {
				if (i % 2 != 0) {
					System.out.print("1 ");
					k++;
				} else {
					System.out.print("2 ");
					k++;
				}
			}
			System.out.println();
			i++;
		}
	}
}
