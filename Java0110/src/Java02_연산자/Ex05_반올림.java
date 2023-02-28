package Java02_연산자;

public class Ex05_반올림
{

	public static void main(String[] args)
	{
		//반올림 %f, Math.round() => 소수점 첫째 자리에서 반올림한 결과를 정수로 반환(*Int로 return함.*)
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);	//3.142
		
		pi = 3.141592;
		shortPi = Math.round(pi * 1000) / 1000;
		System.out.println(shortPi);	//3.0 -> 정수인 1000으로 나누었으니 정수 3.0이 나오는 것
	}

}
