package java06.sec16.quiz;

public class TestAcc {
    public static void main(String[] args) throws Exception {

        String accNo = null;
        int balance = 0;

        Ex02_Account accObj = new Ex02_Account("078-3762-293");  //생성자 초기화 필요(계좌번호는 한번 생성되면 변경불가)
		//accObj.setAccNo("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println(accNo + " 잔고는 " + balance + "만원입니다.");

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo() + " 잔고는 " + balance + "만원입니다.");

        accObj.deposit(30);
        //30만원이 출고되었습니다.
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
    }

}
