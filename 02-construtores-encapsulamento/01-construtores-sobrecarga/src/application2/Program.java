package application2;


import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[]args) {
		
		Scanner sc = new  Scanner(System.in);		
				
		System.out.println("Enter product data:");
		
		System.out.println("name:");
		String name = sc.nextLine();
		
		System.out.println("price: ");
		Double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println(product.toString()); // way to call the toString method

		// System.out.println(product); // segunda forma de chamar o metodo toString
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}

