package Java01_객체;
//오버로딩
class Calc{
	int add(int n1, int n2) {
		return n1 + n2;
	}
	
	int add(int n) {
		return n + 1;
	}
	
	double add(double d1, double d2) {
		return d1 + d2;
	}
}

public class Ex06_오버로딩
{
	public static void main(String[] args)
	{
		//Calc calc = new Calc();
		Calc calc = null;
		calc = new Calc();
		
		//다양한 형에 대해서 사용이 가능해지기 떄문에 '다형성'이라고도 한다.
		int result1 = calc.add(10, 20);
		int result2 = calc.add(40);
		double result3 = calc.add(10.2, 4.5);

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
	}
}
