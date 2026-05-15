package entities;

/**
 * Conta poupança que especializa `Account` com uma taxa de juros.
 * Demonstra como sobrescrever métodos da superclasse (polimorfismo).
 */
public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        // Sobrescrevemos para remover a taxa fixa aplicada na superclasse
        balance -= amount;
    }
}
