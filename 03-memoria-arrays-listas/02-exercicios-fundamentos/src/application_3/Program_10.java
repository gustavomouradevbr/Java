package application_3;

import java.util.Scanner;

public class Program_10 {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many rows (M)? ");
			int m = sc.nextInt();

			System.out.println("How many columns (N)? ");
			int n = sc.nextInt();

			int[][] mat = new int[m][n];

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}

			System.out.print("Enter the X value to search: ");
			int x = sc.nextInt();

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] == x) {
						System.out.println("Position " + i + "," + j + ":");

						if (j > 0) {
							System.out.println("Left: " + mat[i][j - 1]);
						}

						if (i > 0) {
							System.out.println("Up: " + mat[i - 1][j]);
						}

						if (j < mat[i].length - 1) {
							System.out.println("Right: " + mat[i][j + 1]);
						}

						if (i < mat.length - 1) {
							System.out.println("Down: " + mat[i + 1][j]);
						}
					}
				}
			}
		}
	}

}
