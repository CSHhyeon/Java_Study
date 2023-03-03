package Java01.sec02_throw;

public class Ex01
{
	public static void myMethod1(int n) {
		myMethod2(n, 0);
	}
	
	public static void myMethod2(int n1, int n2) {
		try {
			int r = n1 / n2;
		}
		catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	public static void main(String[] args)
	{
		myMethod1(3);
		System.out.println("Exception Throw!");
	}

}
