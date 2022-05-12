package chapter10.exam;

public class CheckingAccount extends BankAccount {
	// 필드
	private SavingsAccount protectedBy;

	// 생성자
	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	// 메소드
	@Override
	public boolean withdraw(int amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		} else if (balance < amount && protectedBy.balance >= amount) {
			protectedBy.balance += (this.balance - amount);
			this.balance = 0;
			return true;
		} else {
			System.out.println("잔액이 부족합니다.");
			return false;
		}

	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}
