package application_3;

import java.util.Scanner;

import entities_3.DollarConverter;

public class Program_4 {
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarsToBuy = sc.nextDouble();
		
		
		double amountInReais = DollarConverter.currencyConverter(dollarPrice, dollarsToBuy);
		System.out.printf("Amount to be paid in reais: %.2f%n", amountInReais);
		
		
		
		
		
		
		
		
		sc.close();
	}

}

