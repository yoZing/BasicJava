package chapter08.exam02;

public class Customer {
	// 필드
	private String firstName; // 고객 이름
	private String lastName; // 고객 성
	private BankAccount[] accounts; // 고객이 소유한 계좌
	private int numberOfAccounts;

	// 생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];

	}

	// 메소드
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@override
	public String toString() {
		return String.format("이름: %s %s, 계좌의 갯수: %d", getFirstName(), getLastName(), getNumberOfAccounts());

	}

}
