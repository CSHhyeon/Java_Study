package java06.sec07.exam02;

public class Korean {  //다형성을 제공하는 기법 중 하나 : 오버로딩
					   //메소드의 매개변수의 개수 or 타입을 다르게 하여 다형성 제공
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자 선언
	public Korean() {}
	public Korean(String nation) {
		this.nation = nation;
	}
	
	public Korean(String n, String s) {
	  name = n;
	  ssn = s;
	}
}