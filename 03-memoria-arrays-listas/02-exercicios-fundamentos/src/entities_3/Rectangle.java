package entities_3;

/**
 * Entidade geometrica para exercitar metodos de calculo.
 */
public class Rectangle {

	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2.0 * (width + height);
	}

	/**
	 * A diagonal usa o teorema de Pitagoras: d = sqrt(w^2 + h^2).
	 */
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

}

