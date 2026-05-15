package entities;

import entities.enums.Color;

/**
 * Classe abstrata que representa uma forma geométrica. Define o contrato
 * `area()` que todas as formas concretas devem implementar.
 */
public abstract class Shape {

    private Color color;

    public Shape() {

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
