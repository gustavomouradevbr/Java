package entities;

import entities.enums.Color;

/**
 * Retângulo: outra implementação concreta de `Shape`.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}
