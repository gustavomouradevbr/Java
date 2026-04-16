package application_3;

import java.util.Scanner;

import entities_3.Rent;

public class Program_6 {
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos estudantes vao alugar? ");
		int n = sc.nextInt();
		

		
		Rent [] vect = new Rent[10];
		
		
		for (int i = 0; i < n; i++) {
		    sc.nextLine(); // Limpar buffer
		    System.out.println("Nome: ");
		    String name = sc.nextLine();
		    
		    System.out.println("Email: ");
		    String email = sc.nextLine(); 
		    
		    System.out.println("Quarto: ");
		    int room = sc.nextInt(); 
		    
		    vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");

		for (int i = 0; i < 10; i++) {
		    if (vect[i] != null) {
		        System.out.println(i + ": " + vect[i]);
		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

