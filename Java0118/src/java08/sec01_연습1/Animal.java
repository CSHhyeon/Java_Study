package java08.sec01_연습1;

public abstract class Animal
{
	private int speed;			//속도 km/h
	private double distance;	//이동거리 km
	
	Animal(int speed){
		this.speed = speed;
	}
	
	public abstract void run(int hours);
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getDistance() {
		return this.distance;
	}
}
