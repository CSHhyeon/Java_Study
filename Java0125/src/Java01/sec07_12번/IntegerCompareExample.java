package Java01.sec07_12번;

public class IntegerCompareExample
{
	public static void main(String[] args)
	{
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);	//true
		System.out.println(obj3 == obj4);	//false
		//true, false인 이유 : 동등비교연산자는 값을 비교하는 범위가 있다.(정수의 비교범위가 있다.)
		//-128~127 사이의 값은 동등 비교를 한다. 하지만 이 범위를 넘어서게 될 경우 '번지'를 비교한다.
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));	//값만 비교
	}
}
