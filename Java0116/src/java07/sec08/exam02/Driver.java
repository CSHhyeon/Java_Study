package java07.sec08.exam02;

public class Driver {
	//메소드 선언(클래스 타입의 매개변수를 가지고 있음)
	public void drive(Vehicle vehicle) {
		//1. Driver driver = new Driver(); 객체가 생성이 되면
		//2. Vehicle vehicle = new Vehicle()이 생성된다.
		//3. 그러면 driver.drive(vehicle);이 실행된다.
		vehicle.run();
	}
	//이제 이 driver는 vehicle인 것들을 다 다룰 수 있게 된다. 택시, 차량, 버스
}