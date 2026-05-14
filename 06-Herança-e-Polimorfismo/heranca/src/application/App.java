package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

         BusinessAccount acc4 =  (BusinessAccount)acc2;
         acc4.loan(100.0);

         if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);

            System.err.println("Loan! ");

         }

         if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update! ");
         }

         Account acc0 = new Account(1001, "Alex", 1000.0);
         acc0.withdraw(200.0);
         System.out.println(acc0.getBalance());

         Account acc01 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
         acc01.withdraw(200.0);
         System.out.println(acc01.getBalance());

         Account acc02 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
         acc02.withdraw(200.0);
         System.out.println(acc02.getBalance());

    }
}
