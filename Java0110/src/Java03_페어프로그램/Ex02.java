package Java03_페어프로그램;

import java.util.Scanner;

public class Ex02
{

	public static void main(String[] args)
	{
		// 5개의 정수를 입력 받아 각각의 수에 + 3, - 3, × 3, / 3, % 3의 연산을 실행하여 그 값을 저장한 후 차례대로 출력하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 수를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d", num1 + 3, num2 - 3, num3 * 3, num4 / 3, num5 % 3);

	}

}
