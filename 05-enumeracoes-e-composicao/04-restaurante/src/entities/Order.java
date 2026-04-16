package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.enums.OrderStatus;

/**
 * Agregado principal do dominio de pedidos.
 *
 * <p>Esta classe centraliza os dados do pedido para tornar o fluxo de depuracao
 * previsivel: cabecalho (cliente, momento, status) + itens.</p>
 */
public class Order {

	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private final List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return Collections.unmodifiableList(items);
	}

	public void addItem(OrderItem orderItem) {
		if (orderItem == null) {
			throw new IllegalArgumentException("Order item cannot be null.");
		}
		items.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		items.remove(orderItem);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

}

