package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num05_1304
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int num = 1;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[j][i] = num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
