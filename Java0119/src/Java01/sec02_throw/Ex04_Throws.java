package Java01.sec02_throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_Throws
{
	public static void myMethod1() {
		myMethod2();
	}
	
	//throws 메서드는 선언부에 예외를 써주는 문법이다. 
	//메서드의 선언부만 보더라도 이 메서드를 사용하려면 어떤 예외를 처리하면 되는지를 쉽게 파악할 수 있다.
	public static void myMethod2() throws ArithmeticException, InputMismatchException {	
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int r = n1/n2;
	}
	
	public static void main(String[] args)
	{
		try {
			myMethod1();
		}
		catch(ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
	}
}
