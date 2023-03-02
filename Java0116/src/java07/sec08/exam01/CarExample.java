package java07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();

		//Tire 객체 장착
		car.tire = new Tire(); //타이어 선택 장착
		car.run();             //회전합니다.

		//HankookTire 객체 장착
		car.tire = new HankookTire();
		car.run();             //한국타이어가 회전합니다.

		//KumhoTire 객체 장착
		car.tire = new KumhoTire();
		car.run();             //금호타이어가 회전합니다.
	}
}