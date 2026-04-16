package entities;

/**
 * Representa um triangulo com tres lados e calcula sua area pela formula de Heron.
 */
public class Triangle {
	private double a;
	private double b;
	private double c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	/**
	 * Usa Heron para manter o exemplo matematico simples em um unico metodo.
	 */
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

