package application_3;

import java.util.Scanner;

import entities_3.Pessoa;

public class Program_8 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		for(int i = 0; i < n; i++) {
		System.out.println("Dados da " + (i + 1) + "a pessoa:");
		
		System.out.println("Nome: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Altura: ");
	    double altura = sc.nextDouble();
	    
	    vect[i] = new Pessoa(name, idade, altura);
			
			
		}
		
		int cont = 0; 
		double soma = 0.0;

		for (int i = 0; i < n; i++) {
		    soma = soma + vect[i].getAltura();
		    
		    if (vect[i].getIdade() < 16) {
		        cont = cont + 1; 
		    }
		}

		
		double media = soma / n;
		System.out.printf("Altura média: %.2f%n", media);

		
		double porcentagem = cont * 100.0 / n; 

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		for(int i = 0; i < n; i++) {
		    if (vect[i].getIdade() < 16) {
		        System.out.println(vect[i].getName());
		    }
		}
		
		
		
		
		
		
		
		sc.close();
		
	}

}

