package Java01_Test;

import java.util.Scanner;

public class Main05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(num + " ");
				num += 2;
				if(num > 10) num = 1;
			}
			System.out.println();
		}
	}
}
