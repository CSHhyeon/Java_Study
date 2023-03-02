package java07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); -> Phone은 실체클래스가 아닌 디자인적인 추상클래스이기에 객체화가 불가능하다.
		//Phone 객체는 추상클래스이기 때문에 new 연산자로 직접 생성할 수는 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		 
	}
}