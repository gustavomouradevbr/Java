package entities;

/**
 * Representa os dados de um pedido usados para calculo de desconto.
 *
 * <p>A classe guarda somente estado e validacoes basicas para separar
 * responsabilidade de regra de negocio da camada de entrada.</p>
 */
public class Pedido {

    private double orderValue;
    private ClientType clientType;
    private boolean customerActive;
    private int loyaltyPoints;

    public Pedido() {
        this.clientType = ClientType.REGULAR;
    }

    public Pedido(double orderValue, ClientType clientType, boolean customerActive, int loyaltyPoints) {
        setOrderValue(orderValue);
        setClientType(clientType);
        setCustomerActive(customerActive);
        setLoyaltyPoints(loyaltyPoints);
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        if (orderValue < 0.0) {
            throw new IllegalArgumentException("Order value cannot be negative.");
        }
        this.orderValue = orderValue;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        if (clientType == null) {
            throw new IllegalArgumentException("Client type cannot be null.");
        }
        this.clientType = clientType;
    }

    public boolean isCustomerActive() {
        return customerActive;
    }

    public void setCustomerActive(boolean customerActive) {
        this.customerActive = customerActive;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        if (loyaltyPoints < 0) {
            throw new IllegalArgumentException("Loyalty points cannot be negative.");
        }
        this.loyaltyPoints = loyaltyPoints;
    }

    /**
     * Mantido por compatibilidade com exercicios anteriores.
     */
    public Double descontoFinal() {
        return new services.OrderDiscountService().calculateTotalDiscountPercent(this);
    }

    /**
     * Mantido por compatibilidade com exercicios anteriores.
     */
    public Double calcularValorComDesconto() {
        return new services.OrderDiscountService().calculateFinalPrice(this);
    }
}
