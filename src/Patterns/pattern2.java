package Patterns;

public class pattern2 {
	public static void main(String[] args) {
		int n = 19;
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			int temp2 = i - 1;
			int temp3 = i - 1;
			if (i == 1) {
				for (int space = 1; space <= 2 * n - 1; space++) {
					System.out.print(" ");
				}
			} else {
				for (int space = 1; space <= 2 * (n - i) + 1; space++) {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				if (i == 1) {
					System.out.print(temp + " ");
				} else {
					System.out.print(temp2 + " ");
					temp2--;
					if (temp2 == 0) {
						for (int k = 0; k <= temp3; k++) {
							System.out.print(k + " ");
						}
						break;
					}
				}
			}
			System.out.println();
		}
	}
}
