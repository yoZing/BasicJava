package chapter08.exam02;

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
    /**
     * 입금
     * @param amount
     */
	public void deposit(int amount) {
		this.balance = balance + amount;
	}

	public boolean withdraw(int amount) {
		if (balance - amount > 0) {
			this.balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
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
