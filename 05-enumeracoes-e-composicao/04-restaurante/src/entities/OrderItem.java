package entities;

/**
 * Item de pedido que captura o produto e a quantidade comprada.
 */
public class OrderItem {

	private Product product;

	private Integer quantity;

	public OrderItem() {
	}

	public OrderItem(Product product, Integer quantity) {
		setProduct(product);
		setQuantity(quantity);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		if (product == null) {
			throw new IllegalArgumentException("Product cannot be null.");
		}
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		if (quantity == null || quantity <= 0) {
			throw new IllegalArgumentException("Quantity must be greater than zero.");
		}
		this.quantity = quantity;
	}

	/**
	 * O subtotal fica na classe de item para concentrar a regra de multiplicacao
	 * junto dos dados que a compoem.
	 */
	public Double subTotal() {
		return product.getPrice() * quantity;
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", $"
				+ String.format("%.2f", product.getPrice())
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}

}

