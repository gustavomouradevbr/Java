package entities;

/**
 * Classe utilitaria para calculos geometricos sem necessidade de instancia.
 */
public class Calculator {

	public static final double PI = 3.14159;

	/**
	 * Metodo estatico para destacar reuso sem criar objeto.
	 */
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
    }

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

