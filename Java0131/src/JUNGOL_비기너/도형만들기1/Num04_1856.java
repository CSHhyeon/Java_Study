package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num04_1856
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 1;
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i % 2 == 0) {
					arr[i][j] = num++;
				}
				else {
					arr[i][m - j - 1] = num++;
				}
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
