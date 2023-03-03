package java08.sec01_연습2;

public class TVFactory extends Factory implements IWorkingTogether
{

	TVFactory(String name, int openHour, int closeHour)
	{
		super(name, openHour, closeHour);
	}

	@Override
	public int workTogether(IWorkingTogether partner)
	{
		TVFactory intf = null;
		intf = (TVFactory)partner;
		return intf.makeProducts('C');
	}

	@Override
	public String name(IWorkingTogether partner)
	{
		TVFactory intf = null;
		intf = (TVFactory)partner;
		return intf.getFactoryName();
	}
	
	@Override
	int makeProducts(char skill)
	{
		if(skill == 'A') return 8 * this.getWorkingTime();
		else if(skill == 'B') return 5 * this.getWorkingTime();
		else if(skill == 'C') return 3 * this.getWorkingTime();
		else return this.getWorkingTime();
	}

}
