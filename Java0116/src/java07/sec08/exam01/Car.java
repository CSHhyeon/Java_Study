package java07.sec08.exam01;

public class Car {
	//필드 선언
	public Tire tire;

	//메소드 선언
	public void run() {
		System.out.println("타이어 선택 장착");
		tire.roll();
	}
}