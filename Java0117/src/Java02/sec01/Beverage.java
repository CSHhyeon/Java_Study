package Java02.sec01;

public abstract class Beverage	//부모클래스
{
	private String name;
	protected int price;
	
	public abstract void calcPrice();
	
	public Beverage(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
}
