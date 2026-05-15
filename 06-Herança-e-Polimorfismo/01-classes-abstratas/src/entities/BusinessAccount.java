package entities;

/**
 * Conta empresarial que estende `Account` adicionando limite de empréstimo.
 * Mostra como especializar comportamento da superclasse.
 */
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // reaproveita lógica da superclasse
        balance -= 2.0; // taxa adicional específica da BusinessAccount
    }
}
