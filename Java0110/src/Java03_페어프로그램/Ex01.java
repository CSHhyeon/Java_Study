package Java03_페어프로그램;

import java.util.Scanner;

public class Ex01
{

	public static void main(String[] args)
	{
		// 두 개의 정수를 입력 받아 다음과 같이 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 수를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d%n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d%n", num1, num2, num1 % num2);	//printf안의 %는 %%로 쓰면 된다.
		
	}
}
