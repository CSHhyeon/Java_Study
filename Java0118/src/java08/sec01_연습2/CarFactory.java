package java08.sec01_연습2;

public class CarFactory extends Factory implements IWorkingTogether
{

	CarFactory(String name, int openHour, int closeHour)
	{
		super(name, openHour, closeHour);
	}

	@Override
	public int workTogether(IWorkingTogether partner)
	{
		CarFactory incf = null;
		incf = (CarFactory)partner;
		return incf.makeProducts('B');
	}
	
	@Override
	public String name(IWorkingTogether partner)
	{
		CarFactory incf = null;
		incf = (CarFactory)partner;
		return incf.getFactoryName();
	}

	@Override
	int makeProducts(char skill)
	{
		if(skill == 'A') return 3 * this.getWorkingTime();
		else if(skill == 'B') return 2 * this.getWorkingTime();
		else if(skill == 'C') return 1 * this.getWorkingTime();
		else return 0;
	}

}
