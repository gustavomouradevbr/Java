package application_3;

import java.util.Scanner;

import entities_3.Student;

public class Program_3 {
	public static void main(String[]args) {
		
		
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		student.setName(sc.nextLine());
		
		System.out.println("enter your first note: ");
		student.setFirstNote(sc.nextDouble());
		
		System.out.println("enter your second note: ");
		student.setSecondNote(sc.nextDouble());
		
		System.out.println("enter your third note: ");
		student.setThirdNote(sc.nextDouble());
		
		
		System.out.println();
		student.showStatus();		
		
		
		
		
		
		
		
		sc.close();
	}


}

