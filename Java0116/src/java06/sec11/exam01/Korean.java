package java06.sec11.exam01;

public class Korean {
	//인스턴스 final 필드 선언
	final String nation = "대한민국"; //상수(고정값)가 된 것.
	final String ssn;
	
	//인스턴스 필드 선언
	String name;

	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}