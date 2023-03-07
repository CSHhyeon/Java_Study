package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num07_1307
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		char now = 'A';
		
		for(int i = n - 1; i >= 0; i--) {
			for(int j = n - 1; j >= 0; j--) {
				arr[j][i] = now++;
				if(now > 'Z') now = 'A';
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
