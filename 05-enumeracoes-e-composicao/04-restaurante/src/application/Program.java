package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import services.OrderSummaryService;

/**
 * Executa um fluxo simples de cadastro de pedido.
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter birthDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter client data:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Birth date (dd/MM/yyyy): ");
            LocalDate birthDate = LocalDate.parse(scanner.nextLine(), birthDateFormatter);

            System.out.println("\nEnter order data:");
            System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
            OrderStatus status = OrderStatus.valueOf(scanner.nextLine().trim().toUpperCase());

            Client client = new Client(name, email, birthDate);
            Order order = new Order(LocalDateTime.now(), status, client);

            System.out.print("How many items to this order? ");
            int itemCount = scanner.nextInt();

            for (int i = 1; i <= itemCount; i++) {
                scanner.nextLine();
                System.out.println("\nEnter #" + i + " item data:");
                System.out.print("Product name: ");
                String productName = scanner.nextLine();
                System.out.print("Product price: ");
                double productPrice = scanner.nextDouble();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();

                Product product = new Product(productName, productPrice);
                OrderItem item = new OrderItem(product, quantity);
                order.addItem(item);
            }

            OrderSummaryService summaryService = new OrderSummaryService();
            System.out.println();
            System.out.println(summaryService.buildSummary(order));
        }
    }
}

