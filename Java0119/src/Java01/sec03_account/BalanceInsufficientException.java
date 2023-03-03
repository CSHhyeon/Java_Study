package Java01.sec03_account;

public class BalanceInsufficientException extends Exception {
	BalanceInsufficientException(){}
	BalanceInsufficientException(String Message){
		super(Message);
	}
}

