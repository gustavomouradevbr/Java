package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 * Exemplo de uso de classes abstratas: `Account` é uma classe base comum
 * que define comportamento compartilhado. `SavingsAccount` e `BusinessAccount`
 * estendem `Account` e especializam comportamentos.
 * Comentários ajudam a entender por que usamos herança e polimorfismo.
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Usamos uma lista do tipo da superclasse: polimorfismo em ação.
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;
        // Cada elemento pode ser uma subclasse diferente; chamamos métodos comuns.
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        // Chamada ao método `deposit` é resolvida dinamicamente para cada instância.
        for (Account acc : list) {
            acc.deposit(10.0);
        }

        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
