package Java03_AccessModifier;

public class Ex02_Quiz
{
	private String name;		//이름
	private String subject;		//과정명
	private int fee;			//교육비
	private double returnFee;	//환급금
	
	public Ex02_Quiz(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	
	public void calcReturnFee() {
		if (this.subject.equals("javaprogram")) {
			this.returnFee = this.fee * 25 / (double)100;
		}
		else if(this.subject.equals("jspprogram")) {
			this.returnFee = this.fee * 20 / (double)100;
		}
		else{
			System.out.println("그런 과정명은 없습니다.");
			System.exit(0);
		}
	}
	
	public void print() {
		System.out.println(this.name + "씨의 과정명은 " + this.subject + "이고 교뮥비는 " + this.fee + "이며 환급금은 " + this.returnFee + "입니다.");
		
	}
}
