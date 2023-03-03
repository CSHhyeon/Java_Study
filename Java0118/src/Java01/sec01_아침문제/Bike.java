package Java01.sec01_아침문제;

public class Bike extends Wheeler
{
	Bike(String carName, int velocity, int wheelNumber){
		this.carName = carName;
		this.velocity = velocity;
		this.wheelNumber = wheelNumber;
	}

	@Override
	public void speedUp(int speed)
	{
		this.velocity += speed;
		if(this.velocity > 40) {
			this.velocity = 40;
			System.out.println(this.carName + "의 최고속도위반으로 속도를 " + this.velocity + " 으로 내립니다.");
		}
		else System.out.println(this.carName + "의 현재 속도는 " + this.velocity + " 입니다.");
	}

	@Override
	public void speedDown(int speed)
	{
		this.velocity -= speed;
		if(this.velocity < 10) {
			this.velocity = 10;
			System.out.println(this.carName + "의 최저속도위반으로 속도를 " + this.velocity + " 으로 올립니다.");
		}
		else System.out.println(this.carName + "의 현재 속도는 " + this.velocity + " 입니다.");
	}

}
