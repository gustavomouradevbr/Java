package services;

import entities.ClientType;
import entities.Pedido;

/**
 * Centraliza as regras de desconto para facilitar teste e depuracao.
 */
public class OrderDiscountService {

    private static final double PREMIUM_DISCOUNT_PERCENT = 5.0;
    private static final double ACTIVE_CUSTOMER_DISCOUNT_PERCENT = 3.0;

    /**
     * Mantem a regra didatica do exercicio: pontos de fidelidade somam ao percentual.
     */
    public double calculateTotalDiscountPercent(Pedido order) {
        double discount = 0.0;

        if (order.getClientType() == ClientType.PREMIUM) {
            discount += PREMIUM_DISCOUNT_PERCENT;
        }
        if (order.isCustomerActive()) {
            discount += ACTIVE_CUSTOMER_DISCOUNT_PERCENT;
        }

        discount += order.getLoyaltyPoints();

        return Math.min(discount, 90.0);
    }

    /**
     * Calcula o total final depois do desconto para isolar essa conta da camada de I/O.
     */
    public double calculateFinalPrice(Pedido order) {
        double discountPercent = calculateTotalDiscountPercent(order);
        double discountValue = (order.getOrderValue() * discountPercent) / 100.0;
        return order.getOrderValue() - discountValue;
    }
}

