package Java01.sec01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int result = n1/n2; 			//예외처리 필요(실행예외 -> 컴파일할 때는 문제 없었음.)
			System.out.println(result);
		}
		catch(ArithmeticException e1) {		//0으로 나눌 때 생기는 에러
			String str = e1.getMessage();
			System.out.println("산술연산 예외가 발생하였습니다. : " + str);
			if(str.equals("/ by zero")) System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(InputMismatchException e2) {	//nextInt()로 받는데 String이 들어온 경우 -> 컴파일 에러
			String str = e2.getMessage();
			System.out.println("입력 예외가 발생하였습니다. : " + str);
		}
		finally {	//예외 발생하든 말든 실행해주는 구문. finally는 꼭 필요없다. 생략 가능
			System.out.println("finally가 실행되었습니다 .");
		}
		
		System.out.println("[정상진행]");
		
		/*
		catch(Exception e) {
			e.printStackTrace();
			//-> java.lang.ArithmeticException: / by zero at Java01.sec01.exception.Ex01.main(Ex01.java:13)
			//즉, ArithmeticException을 쓰면 되겠구나!
		}
		*/
	}
}
