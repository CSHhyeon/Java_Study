package Java02.base.Object;

public class Ex02_equals
{

	public static void main(String[] args)
	{
		//equals() : 해당 인스턴스를 매개변수로 전달받은 참조 변수와 비교하여, 결과를 반환(true or false)
		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.equals(obj2));
	}

}
