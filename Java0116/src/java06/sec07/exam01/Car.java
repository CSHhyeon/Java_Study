package java06.sec07.exam01;

public class Car {
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언[생성자 오버로딩]
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}