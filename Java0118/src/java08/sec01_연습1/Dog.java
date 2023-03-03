package java08.sec01_연습1;

public class Dog extends Animal
{

	Dog(int speed)
	{
		super(speed);
	}

	@Override
	public void run(int hours)
	{
		this.setDistance(this.getDistance() + (hours * this.getSpeed())/2 );
	}

}
