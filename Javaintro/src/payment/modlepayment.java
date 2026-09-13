package payment;

public class modlepayment {
	private int Balance ;
	private int amount;
	
	public int getBalance() {
		return Balance;
	}
	public int setBalance(int balance) {
		return Balance = balance;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public modlepayment() {
		
	}
	
	public modlepayment(int amount) {
		super();
		this.amount = amount;
	}
	public modlepayment(int balance, int amount) {
		super();
		Balance = balance;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "modlepayment [Balance=" + Balance + ", amount=" + amount + "]";
	}
	
	
	

}
