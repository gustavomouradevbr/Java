package entities;

/**
 * Variante de produto usada para praticar encapsulamento e sobrecarga.
 */
public class Product2 {

    private String name;
    private double price;
    private int quantity;

    // Construtor completo (Corrigido para Product2)
    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Sobrecarga de Construtor (Corrigido para Product2)
    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters e Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Centraliza o calculo do valor total para reaproveitar no toString.
     */
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Método toString
    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
