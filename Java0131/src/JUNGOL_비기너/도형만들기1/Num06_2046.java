package JUNGOL_비기너.도형만들기1;

import java.util.Scanner;

public class Num06_2046
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		switch(m) {
		case 1 :
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					System.out.printf("%d ", i);
				}
				System.out.println();
			}
			break;
		case 2 :
			int[] arr = new int[n];
			for(int i = 1; i <= n; i++) {
				arr[i - 1] = i;
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 1; j <= n; j++) {
					if(i % 2 == 0) {
						System.out.printf("%d ", arr[j - 1]);
					}
					else {
						System.out.printf("%d ", arr[n - j]);
					}
				}
				System.out.println();
			}
			break;
		case 3 :
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					System.out.printf("%d ", i*j);
				}
				System.out.println();
			}
			break;
		}
	}
}
