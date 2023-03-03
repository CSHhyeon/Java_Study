package Java02_map.sec04_Comparable.Ex02;

public class Fruit implements Comparable<Fruit>
{
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		this.name = name;	//과일명
		this.price = price;	//가격
	}

	@Override
	public int compareTo(Fruit o)
	{
		if(this.price == o.price) return 0;
		else {
			if(price > o.price) return 1;
			else return -1;
		}
	}
}
