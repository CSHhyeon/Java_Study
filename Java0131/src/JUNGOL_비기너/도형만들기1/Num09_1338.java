package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num09_1338
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char now = 'A';
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = i, k = N - 1; j < N; j++, k--) {
				arr[j][k] = now++;
				if(now > 'Z') now = 'A';
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == '\0') System.out.print("  ");
				else System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
