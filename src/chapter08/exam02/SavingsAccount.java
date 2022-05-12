package chapter08.exam02;

public class SavingsAccount extends BankAccount {
	// 필드
	double interestRate; // 이자율

	// 생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	/**
	 * 결산 이자
	 * @param period
	 */
	public void updateBalance(int period) {
		this.balance += this.balance * interestRate * period;
	}
	@Override
	public String getAccountType() {
		return "저축예금";
	}
}
