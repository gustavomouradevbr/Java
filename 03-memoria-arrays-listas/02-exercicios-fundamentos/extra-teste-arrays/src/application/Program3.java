package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Estoque;

public class Program3 {
	public static void main(String[]main) {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Estoque> list = new ArrayList<>();
		 		
		
		System.out.println("Digite quantos produtos serão cadastrados: ");
		int n = sc.nextInt();
		
			for(int i = 0; i < n; i++) {
				sc.nextLine();
			
			System.out.println("Digite o nome: ");
			 String name = sc.nextLine();
			 
			System.out.println("Digite o preço: ");
			 double price = sc.nextDouble();
			 
			System.out.println("Digite a quantidade que você quer: ");
			 int quantity = sc.nextInt();
			 
			 list.add(new Estoque(name, price, quantity));
			
		}
		
		list.removeIf(x  -> x.getPrice() >= 50);
				
		
		List<Estoque> listagamer = list.stream().filter(x -> x.getName().contains("Gamer")).collect(Collectors.toList());
		
        Estoque product = list.stream().filter(x -> x.getQuantity() >= 10).findFirst().orElse(null);
        
        if (product != null) {
        	System.out.println(product);
        } else {
        	System.out.println("Nenhum produto em abundância");

        }
        
        

		
		sc.close();
		
	}

}
		
	

