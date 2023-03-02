package Java02.sec01;

public class Tea extends Beverage
{
	public static int amount = 0;	//잔의 양
	
	public Tea(String name)
	{
		super(name);
		this.amount++;
	}

	@Override
	public void calcPrice()
	{
		if(this.getName().equals("lemonTea")) this.price = 1500;
		else if(this.getName().equals("ginsengTea")) this.price = 2000;
		else if(this.getName().equals("redginsengTea")) this.price = 2500;
		else System.out.println("없는 메뉴입니다.");
	}
}
