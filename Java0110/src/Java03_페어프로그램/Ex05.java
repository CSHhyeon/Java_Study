package Java03_페어프로그램;

import java.util.Scanner;

public class Ex05
{

	public static void main(String[] args)
	{
		//3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 true 아니면 false을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int big = 0;
		boolean bool = false;
		
		if(a > b && a > c) big = 1;
		if(a == b && a == c) bool = true;
		
		System.out.printf("%d %b%n", big, bool);
	}

}
