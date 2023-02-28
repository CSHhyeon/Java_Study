package Java03_문제풀기;

import java.util.Scanner;

public class Ex14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(num == 11) num = 1;
				System.out.printf("%d ", num);
				num += 2;
			}
			System.out.println();
		}
	}
}
