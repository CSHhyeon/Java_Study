package Java01.sec02_throw;

import java.util.Scanner;

public class Ex03
{

	public static void myMethod1() {
		try {
			myMethod2();
		}
		catch(Throwable e1) {
			System.out.println("Error!");
		}
	}
	
	public static void myMethod2() {	//이 메소드는 다양한 곳에서 불린다. 그 때마다 예외 확인까지는 부담이 된다.
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int r = n1/n2;
	}
	
	public static void main(String[] args)
	{
		myMethod1();
		myMethod2();
		System.out.println("Exception Throw!");
	}

}
