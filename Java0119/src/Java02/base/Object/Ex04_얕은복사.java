package Java02.base.Object;

class Car implements Cloneable{	//깊은 복사를 하기 위해 implement
	private String name;
	private int price;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	@Override
	public Object clone() throws CloneNotSupportedException	//public으로 바꿔야 내가 활용 가능하다.
	{
		
		return super.clone();
	}
}

public class Ex04_얕은복사
{
	public static void main(String[] args)
	{
		//deep copy : 한 인스턴스의 내용을 복제하여 새로운 공간에 생성한다.
		
		//shallow copy : 복제의 대상을 참조하는 또 다른 인스턴스를 만드는 것 (참조 주소값을 복사)
		Car c1 = new Car();
		c1.setName("현대 자동차");
		
		Car c2 = new Car();
		c2.setName("삼성 자동차");
		
		Car c3 = c2;	//shallow copy(얕은 복사)
		
		Car c4 = new Car();
		try{
			c4 = (Car)c1.clone();	//Car 타입으로 다운캐스팅
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("c1의 해시코드 : " + c1.hashCode());
		System.out.println("c2의 해시코드 : " + c2.hashCode());
		System.out.println("c3의 해시코드 : " + c3.hashCode()); //얕은 복사라 같은 주소를 공유
		System.out.println("c4의 해시코드 : " + c4.hashCode()); //깊은 복사라 주소도 다름
	}
}
