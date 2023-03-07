package JUNGOL_비기너.수학1;

import java.util.Scanner;

public class Num01_1692
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int one = num2 % 10;		//1의 자리
		int ten = (num2 / 10) % 10;	//10의 자리
		int hun = num2 / 100;		//100의 자리
		
		int first = num1 * one;
		int second = num1 * ten * 10;
		int third = num1 * hun * 100;
		
		System.out.println(first);
		System.out.println(second / 10);
		System.out.println(third / 100);
		System.out.println(first + second + third);
	}
}
