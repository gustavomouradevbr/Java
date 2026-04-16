package services;

import java.time.format.DateTimeFormatter;

import entities.Order;
import entities.OrderItem;

/**
 * Responsavel por montar a saida textual do pedido.
 *
 * <p>Separar formatacao em um servico evita misturar regra de apresentacao
 * dentro da entidade e simplifica a depuracao da logica de dominio.</p>
 */
public class OrderSummaryService {

    private static final DateTimeFormatter MOMENT_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public String buildSummary(Order order) {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY\n");
        sb.append("Moment: ").append(order.getMoment().format(MOMENT_FORMATTER)).append("\n");
        sb.append("Order status: ").append(order.getStatus()).append("\n");
        sb.append("Client: ").append(order.getClient()).append("\n");
        sb.append("Order items:\n");

        for (OrderItem item : order.getItems()) {
            sb.append(item).append("\n");
        }

        sb.append("Total price: $").append(String.format("%.2f", order.total()));
        return sb.toString();
    }
}

