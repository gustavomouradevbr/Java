package application;
import entities.Triangle;
import java.util.Scanner;

/**
 * Revisao rapida de introducao a POO usando objetos Triangle.
 */
public class Program {
	public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	
	Triangle x, y;
	x = new Triangle();
	y = new Triangle();
	
	// O foco deste exemplo e mostrar que cada objeto guarda seu proprio estado.
	System.out.println("Enter the measures of triangle X: ");
	x.setA(sc.nextDouble());
	x.setB(sc.nextDouble());
	x.setC(sc.nextDouble());
	
	System.out.println("Enter the measures of triangle Y: ");
	y.setA(sc.nextDouble());
	y.setB(sc.nextDouble());
	y.setC(sc.nextDouble());
	
	double areaX = x.area();
	double areaY = y.area();

	
	System.out.printf("Triangle X area: %.4f%n", areaX);
	System.out.printf("Triangle Y area: %.4f%n", areaY);
	
	if (areaX > areaY) {
	System.out.println("Larger area: X");
	}
	else {
	System.out.println("Larger area: Y");
	}




sc.close();
}
	
}

