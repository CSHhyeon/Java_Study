package JUNGOL_도형만들기2;

import java.util.Scanner;

public class Num02_1719
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n < 1 || n > 100 || n % 2 == 0 || m < 1 || m > 4) {
			System.out.println("INPUT ERROR!");
		}
		else {
			switch(m) {
			case 1 :
				for(int i = 0; i < n / 2 + 1; i++) {
					for(int j = 0; j < i + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i = 0; i < n / 2; i++) {
					for(int j = n/2 - i; j > 0; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 2 :
				for(int i = 0; i < n / 2 + 1; i++) {
					for(int j = n / 2 - i; j > 0; j--) {
						System.out.print(" ");
					}
					
					for(int j = 0; j < i + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i = 0; i < n / 2; i++) {
					for(int j = 0; j < i + 1; j++) {
						System.out.print(" ");
					}
					
					for(int j = n/2 - i; j > 0; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 3 :
				for(int i = 0; i < n / 2 + 1; i++) {
					for(int j = 0; j < i; j++) {
						System.out.print(" ");
					}
					
					for(int j = i * 2; j < n; j += 2) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i = 0; i < n / 2; i++) {
					for(int j = n/2; j > 0; j--) {
						System.out.print(" ");
					}
					
					for(int j = 0; j < n - 2; j += 2) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 4 :
				for(int i = 0; i < n / 2 + 1; i++) {
					for(int j = 0; j < i + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i = 0; i < n / 2; i++) {
					for(int j = n/2 - i; j > 0; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
		}

	}
}
