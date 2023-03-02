package java07.sec10.exam01;

public class SmartPhone extends Phone {
	//생성자 선언
	SmartPhone(String owner)
	{
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색 기능을 제공합니다.");
	}
}