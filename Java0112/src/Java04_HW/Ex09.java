package Java04_HW;

import java.util.Scanner;

public class Ex09
{

	public static void main(String[] args)
	{
		// 파스칼 삼각형
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] store = new int[n][n];
		store[0][0] = 1; store[0][1] = 0;
		
		//입력
		for(int i = 1; i < n; i++) {
			store[i][0] = 1;
			for(int j = 1; j < i; j++) {
				store[i][j] = store[i - 1][j - 1] + store[i - 1][j];
				
			}
			store[i][i] = 1;
		}
		
		//출력
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.printf("%d ", store[i][j]);
			}
			System.out.println();
		}

	}
}
