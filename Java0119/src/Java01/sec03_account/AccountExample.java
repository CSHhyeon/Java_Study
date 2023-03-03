package Java01.sec03_account;

public class AccountExample {
	public static void main(String[] args) throws BalanceInsufficientException {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println(account.getBalance());
	
		//출금하기
		try {
			account.withdraw(30000);
		}
		catch (BalanceInsufficientException e1){
			String message = e1.getMessage();
			System.out.println(message);
			e1.printStackTrace();
		}
		catch(Exception e2) {
			e2.getMessage();
		}
		System.out.println("정상종료");
	}
}
