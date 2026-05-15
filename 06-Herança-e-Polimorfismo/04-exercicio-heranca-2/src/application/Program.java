package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

/**
 * Exemplo que utiliza herança para representar tipos de produtos com
 * comportamento diferente (`priceTag`). Mostra sobrescrita de método.
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateStr = sc.next();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate manufactureDate = LocalDate.parse(dateStr, formatter);

                products.add(new UsedProduct(name, price, manufactureDate));

            } else {
                products.add(new Product(name, price));
            }

            System.out.println();
            System.out.println("PRICE TAGS:");
            for (Product product : products) {
                System.out.println(product.priceTag()); // polimorfismo: cada subclasse formata sua tag
            }

        }

        sc.close();
    }

}
