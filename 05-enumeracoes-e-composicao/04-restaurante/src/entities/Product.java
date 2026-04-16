package entities;

/**
 * Produto vendido no pedido.
 */
public class Product {

	private String name;

	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		if (price == null || price < 0.0) {
			throw new IllegalArgumentException("Price must be non-negative.");
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", price);
	}

}

