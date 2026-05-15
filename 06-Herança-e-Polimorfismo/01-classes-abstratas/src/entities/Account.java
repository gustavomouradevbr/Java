package entities;

/**
 * Classe base que representa uma conta bancária.
 * Usamos modificadores de acesso adequados e métodos públicos para encapsulamento.
 */
public abstract class Account {

    private Integer number;
    private String holder;
    protected Double balance; // subclasses podem acessar para operações específicas

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    /**
     * Método de saque básico. Subclasses podem sobrescrever para comportamento diferente.
     */
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    /**
     * Depósito simples — comportamento compartilhado entre subclasses.
     */
    public void deposit(double amount) {
        balance += amount;
    }
}
