package application_3;

import java.util.Scanner;

import entities_3.Employee;

public class Program_2 {
	public static void main(String[]args) {
		
		
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		employee.setName(sc.nextLine());

		
		System.out.println("Gross salary: ");
		employee.setGrossSalary(sc.nextDouble());

		
	
		System.out.println("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		
		System.out.println();
		System.out.println("Update data: " + employee);

	
		
		
		sc.close();
	}


}

