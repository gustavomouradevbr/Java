package application_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities_3.Employee_2;
import entities_3.Pessoa;

public class Program_9 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee_2> list = new ArrayList<>();		
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("id: ");
			Integer id = sc.nextInt();

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
		    double salary = sc.nextDouble();
		    
				
		    list.add(new Employee_2(id, name, salary));			
			
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idProcurado = sc.nextInt();
		
	    Employee_2 emp = list.stream().filter(x -> x.getId() == idProcurado).findFirst().orElse(null);
	    
	    
	    if (emp == null) {
	    	System.out.println("This id does not exist.");
	    } else
	    	System.out.println("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
            
            System.out.println("\nList of employees:");
            for (Employee_2 x : list) {
                System.out.println(x);
            }
            		
		
	
		sc.close();
		
	}
	
	
	

}

