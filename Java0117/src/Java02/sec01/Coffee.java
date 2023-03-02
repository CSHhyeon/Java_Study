package Java02.sec01;

public class Coffee extends Beverage
{
	public static int amount = 0;	//잔의 양
	
	public Coffee(String name)
	{
		super(name);
		this.amount++;
	}
	
	@Override
	public void calcPrice()
	{
		if(this.getName().equals("Americano")) this.price = 1500;
		else if(this.getName().equals("CafeLatte")) this.price = 2500;
		else if(this.getName().equals("Cappuccino")) this.price = 3000;
		else System.out.println("없는 메뉴입니다.");
	}

}
