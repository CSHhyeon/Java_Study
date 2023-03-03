package java08.sec01_연습1;

public class Chicken extends Animal implements Cheatable
{

	Chicken(int speed)
	{
		super(speed);
	}

	@Override
	public void run(int hours)
	{
		this.setDistance(this.getDistance() + (hours * this.getSpeed()));
	}

	@Override
	public void fly()
	{
		this.setSpeed(this.getSpeed() * 2);
	}

}
