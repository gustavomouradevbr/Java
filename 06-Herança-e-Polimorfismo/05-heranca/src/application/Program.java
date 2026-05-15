package application;

import entities.Account;
import entities.SavingsAccount;

/**
 * Introdução ao polimorfismo: mesmo tipo de variável (`Account`) pode referir-se
 * a diferentes implementações em runtime.
 */
public class Program {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0); // comportamento diferente dependendo da implementação

        System.out.println("Saldo final x: " + x.getBalance());
        System.out.println("Saldo final y: " + y.getBalance());
    }
}
