package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num08_1314
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		char now = 'A';
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i % 2 == 0) {
					arr[j][i] = now++;
				}
				else {
					arr[n - 1 - j][i] = now++;
				}
				if(now > 'Z') now = 'A';
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
