package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num10_1339
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N < 1 || N > 100 || N % 2 == 0) {
			System.out.println("INPUT ERROR");
		}
		else {
			int[][] arr = new int[N][N];
			int half = N / 2;
			char now = 'A';
			
			for(int i = half; i >= 0; i--) {
				for(int j = i; j <= 2 * half - i; j++) {
					arr[j][i] = now++;
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
}
