package entities_3;

public class Bank {
	
	private Double number;
	
	private String holder;
	
	private Double balance;
	
	public Bank(Double number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = 0.0;
	}
	
	public Bank(Double number, String holder) {
		this.number = number;
		this.holder = holder;
		}
	
	public Double getNumber() {
		return number;
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
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", " + "Balance: $ " + balance;
		
	}
	
	public void deposit(Double amount) {
		this.balance +=  amount;	
	}
	
	
	public void withdrawn(Double amount) {
		this.balance -=  amount + 5;	

	
	}
	
	
}

