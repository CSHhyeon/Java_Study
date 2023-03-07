package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num02_1341
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		if(s < e) {
			for(int i = s; i <= e; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d   ", i, j, i*j);
					if(j % 3 == 0) System.out.println();
				}
				System.out.println();
			}
		}
		else {
			for(int i = s; i >= e; i--) {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d   ", i, j, i*j);
					if(j % 3 == 0) System.out.println();
				}
				System.out.println();
			}
		}
	}
}
