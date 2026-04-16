package application;

import java.util.Scanner;
import entities.Product;

public class Program2 {
    public static void main(String[] args) {
    	
        // vetores com POO
        
        Scanner sc = new Scanner(System.in);
        
        // Le o tamanho fixo do vetor
        int n = sc.nextInt();
        
        // Declaracao do vetor: diferente da lista, o vetor [] tem tamanho fixo
        // Aqui, 'vect' e um vetor que guarda enderecos para objetos 'Product'
        Product[] vect = new Product[n];
        
        for (int i = 0; i < vect.length; i++) { // vect.length garante que percorra todo o array
            sc.nextLine(); // Limpa o buffer do teclado
            
            String name = sc.nextLine();
            double price = sc.nextDouble();
            
            // Instanciação: Criamos o objeto na memória e colocamos a referência na posição 'i'
            vect[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        
        // Iteracao de soma: usamos vect[i].getPrice() para acessar o valor dentro do objeto
        // Dica: No seu código original estava 'i < 3', o ideal é 'i < vect.length' para não dar erro
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        
        // Cálculo da média aritmética simples
        double avg = sum / n;
        
        // %n pula linha e %.2f formata para 2 casas decimais
        System.out.printf("Average Price: %.2f%n", avg);

        sc.close(); 
    }
}
