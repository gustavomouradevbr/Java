package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ClientType;
import entities.Pedido;
import services.OrderDiscountService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Qual e o valor do pedido? ");
            double orderValue = sc.nextDouble();
            sc.nextLine();

            System.out.print("Tipo de cliente (PREMIUM/REGULAR): ");
            String clientTypeInput = sc.nextLine();

            System.out.print("Cliente ativo? (true/false): ");
            boolean customerActive = sc.nextBoolean();

            System.out.print("Pontos de fidelidade: ");
            int loyaltyPoints = sc.nextInt();

            Pedido order = new Pedido(
                    orderValue,
                    ClientType.fromUserInput(clientTypeInput),
                    customerActive,
                    loyaltyPoints);

            OrderDiscountService discountService = new OrderDiscountService();
            double discountPercent = discountService.calculateTotalDiscountPercent(order);
            double finalPrice = discountService.calculateFinalPrice(order);

            System.out.println("\n--- RESUMO DO PEDIDO ---");
            System.out.printf("Valor original: R$ %.2f%n", order.getOrderValue());
            System.out.printf("Desconto total aplicado: %.2f%%%n", discountPercent);
            System.out.printf("Valor final a pagar: R$ %.2f%n", finalPrice);
        }
    }
}
