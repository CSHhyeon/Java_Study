package Java03_문제풀기;

import java.util.Scanner;

public class Ex09
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i < a + 1; i++) {
			for(int j = 1; j < b + 1; j++) {
				System.out.printf("%d ", i * j);
			}
			System.out.println();
		}
	}

}
