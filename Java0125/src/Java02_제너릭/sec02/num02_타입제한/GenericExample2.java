package Java02_제너릭.sec02.num02_타입제한;

public class GenericExample2
{
	public static<T extends Number> boolean compare(T t1, T t2) {	//T 타입을 Number로 제한
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return (d1 == d2);
	}
	 
	public static void main(String[] args)
	{
		//타입이 넘어갈 때 결정된다.
		boolean result = compare(10, 20);	//compare(Integer, Integer)
		System.out.println(result); 		//false
		System.out.println();
		
		result = compare(4.5, 5.5); //compare(Double, Double)
		System.out.println(result);	//false

	}

}
