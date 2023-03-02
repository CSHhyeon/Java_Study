package java07.sec02;

public class SmartPhone extends Phone { //Phone을 상속받는다. 핸드폰으로서의 기능을 다 물려받는다.
	//필드 선언
	public boolean wifi;

	public SmartPhone(String model, String color) {
		super(); //생략 가능 -> 부모 생성자 호출
		this.model = model;
		this.color = color;
	}

	public boolean isWifi() {
		return wifi;
	}
	
	public void setWifi(boolean wifi)
	{
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경 완료");
	}
	
	public void internet() {
		System.out.println("인터넷 연결 완료");
	}
}