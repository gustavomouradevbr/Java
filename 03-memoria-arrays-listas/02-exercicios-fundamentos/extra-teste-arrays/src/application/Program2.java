package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Altura;

public class Program2 {
public static void main(String[]args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		 System.out.println("Quantas pessoas serao digitadas?");
		 int n = sc.nextInt();
		 Altura[] vect = new Altura[n];
		 
		 for (int i = 0; i < n; i++) {
			 sc.nextLine();
			 
			 System.out.println("Dados da " + (i + 1) + "a pessoa:");
			 
			 System.out.println("Digite seu nome:");
			 String nome = sc.nextLine();
			 
			 System.out.println("Digite sua idade: ");
			 int idade = sc.nextInt();
			 
			 System.out.println("Digite sua altura: ");
			 Double altura = sc.nextDouble();
			 
			 
			 vect[i] = new Altura(nome, idade, altura);
		 }
		 
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i].getAltura();
		}
		
		double avg = sum / n;
		 
		System.out.println("Altura média: " + avg);
		
		int cont = 0;
		
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				cont++;
			}
				
		}
		
		int porcentagem = 0;
		
		porcentagem = porcentagem + (cont / n) * 100;
		
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem );
		
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
}


}

