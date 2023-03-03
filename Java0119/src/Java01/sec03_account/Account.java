package Java01.sec03_account;

public class Account {
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			//throws는 명시, throw는 생성이다. 처리하라고 위임해주는 것이다.
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + "부족합니다.");
		}
		balance -= money;
	}
}

