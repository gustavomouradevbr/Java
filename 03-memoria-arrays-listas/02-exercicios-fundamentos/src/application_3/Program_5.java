package application_3;

import java.util.Scanner;

import entities_3.Bank;

public class Program_5 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		Double number = sc.nextDouble();
        sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		
		
		System.out.println("Is there na initial deposit (y/n)? ");
		String answer = sc.nextLine();
		
		Bank bank;		
		
		
		if (answer.equals("y")) {
		System.out.println("Enter initial deposit value: ");
		Double balance = sc.nextDouble();
		
		bank = new Bank(number, holder, balance);
	
		} else {
		 bank = new Bank(number, holder, 0.0);

			
		}
		
		System.out.println();		
		System.out.println("Account data:");
		System.out.println(bank);	
		
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble(); 
		bank.deposit(depositValue);
		
		
        System.out.println();
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		
		
		System.out.print("Enter a withdraw value: ");
		double withdrawnValue = sc.nextDouble(); 
		bank.withdrawn(withdrawnValue);
		
		
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		
		

				
		sc.close();
	}

}

