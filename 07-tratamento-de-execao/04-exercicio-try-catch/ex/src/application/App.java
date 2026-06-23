package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.BusinessException;

public class App {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("number: ");
    Integer number = sc.nextInt();

    sc.nextLine();

    System.out.println("holder: ");
    String holder = sc.nextLine();

    System.out.println("balance: ");
    Double balance = sc.nextDouble();

    System.out.println("withdrawLimit: ");
    Double withdrawLimit = sc.nextDouble();

    Account acc = new Account(number, holder, balance, withdrawLimit);

    System.out.println();
    try {
		System.out.print("What is the amount you wish to withdraw: ");
		Double amount = sc.nextDouble();

		acc.withdraw(amount);
    System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
    }
    catch (BusinessException e) {
      System.out.println("Withdraw error: " + e.getMessage());
    }











    sc.close();
  }

}
