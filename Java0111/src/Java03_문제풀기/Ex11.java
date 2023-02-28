package Java03_문제풀기;

import java.util.Scanner;

public class Ex11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf("%d ", num);
				num++;
			}
			System.out.println();
		}
	}

}
