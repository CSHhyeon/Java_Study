package java06.sec16.quiz;

public class Ex02_Account
{
	//private은 getter, setter을 지정해줄 수 있다.
	private String accNo;
	private int balance;
	
	//계좌번호 입력
	/* -> 아래 친구로 만들지 않음으로서 계좌번호를 다시 바꿀 수 없게 한 것이다.
	public void setAccNo(String acc) {
		this.accNo = acc;
		this.balance = 0;
		System.out.println(this.accNo + " 계좌가 개설되었습니다.");
	}
	*/
	
	Ex02_Account(String acc) { //계좌가 한 번만 개설되도록 아예 선언 시 초기화하도록 만드는 것
		this.accNo = acc;
		this.balance = 0;
		System.out.println(this.accNo + " 계좌가 개설되었습니다.");
	}
	
	//입금
	public void save(int money) { 	//setter -> 값을 처리하는 함수
		this.balance += money;
		System.out.println(this.accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
	}
	
	//출금
	public void deposit(int money) {
		if(this.balance < money) System.out.println("잔고가 부족합니다.");
		else {
			this.balance -= money;
			System.out.println(this.accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
		}
	}
	
	//잔고 확인
	public int getBalance() {
		return this.balance;
	}
	
	//계좌번호 확인
	public String getAccNo() {
		return this.accNo;
	}
}
