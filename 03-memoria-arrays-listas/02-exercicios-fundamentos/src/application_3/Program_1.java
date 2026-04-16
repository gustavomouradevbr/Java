package application_3;

import java.util.Scanner;

import entities_3.Rectangle;

public class Program_1 {
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		
		System.out.println("Enter rectangle width and height: ");
		rectangle.setWidth(sc.nextDouble());
		rectangle.setHeight(sc.nextDouble());
		
		System.out.println("AREA = " + rectangle.area() );
		System.out.println("PERIMETER = " + rectangle.perimeter());
		
		System.out.println("DIAGONAL = " + rectangle.diagonal() );
		
		
		sc.close();
	}

}
