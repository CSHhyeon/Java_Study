package Java01.sec01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();	
		try {
			int result = n1/n2; 	
			System.out.println(result);

		}
		catch(ArithmeticException | InputMismatchException e) {	//여러 경우를 OR로 처리
			String str = e.getMessage();
			System.out.println("예외가 발생하였습니다. : " + str);
		}
		System.out.println("[정상진행]");
	}
}
