package application_3;

import java.util.Scanner;

public class Program_7 { 
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many numbers will you type?");
			int n = sc.nextInt();
			int[] vect = new int[n];

			for (int i = 0; i < n; i++) {
				System.out.print("Enter a number: ");
				vect[i] = sc.nextInt();
			}

			System.out.println("Negative numbers:");
			for (int i = 0; i < n; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		}
	}

}
