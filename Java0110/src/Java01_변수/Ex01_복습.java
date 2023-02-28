package Java01_변수;

import java.util.Scanner;

public class Ex01_복습
{

	public static void main(String[] args)
	{
		// 정수형 변수 x, y에 10, 20을 각각 할당한 후 x, y값을 바꾸어 출력
		int x = 10, y = 20;
		int empty;
		System.out.printf("변경 전 x = %d, y = %d%n", x, y);
		empty = x;
		x = y;
		y = empty;
		System.out.printf("변경 후 x = %d, y = %d%n", x, y);
		
		//사용자에게 두 개의 정수값을 차례로 받아 순서 바꾸어 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하시오");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하시오");
		int num2 = sc.nextInt();
		System.out.printf("변경 전 num1 = %d, num2 = %d%n", num1, num2);
		int num = num1;
		num1 = num2;
		num2 = num;
		System.out.printf("변경 후 num1 = %d, num2 = %d%n", num1, num2);

	}

}
