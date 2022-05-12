package chapter10.exam;

public abstract class BankAccount {
	// 필드
	protected int balance;

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}

	// 메소드
	public int getBalance() {

		return balance;

	}
	public void deposit(int amount) {
		this.balance = balance + amount;
	}

	public boolean withdraw(int amount) {
		if (balance > amount) {
			this.balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount){
		if (amount < 0 || amount - balance < 0) {
			throw new IllegalArgumentException("해당하는 금액을 보낼 수 없습니다.");
		}
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
	public String toString() {
		return String.format("잔액: %,d", balance);
	}
	
	public abstract String getAccountType();

}
