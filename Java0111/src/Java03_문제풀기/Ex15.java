package Java03_문제풀기;

import java.util.Scanner;

public class Ex15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		if(n > 0 && n <=100 && m >= 1 && m <= 3) {
			if(m == 1) {
				for(int i = 1; i < n + 1; i++) {
					for(int j = 1; j < i + 1; j++) {
						System.out.printf("%c", '*');
					}
					System.out.println();
				}
			}
			else if(m == 2) {
				for(int i = 0; i < n; i++) {
					for(int j = n - i; j > 0; j--) {
						System.out.printf("%c", '*');
					}
					System.out.println();
				}
			}
			else {
				for(int i = 1; i < n + 1; i++) {
					for(int a = 0; a < n - i; a++) {
						System.out.printf("%s", " " );
					}
					for(int b = 0; b < i * 2 - 1; b++) {
						System.out.printf("%c", '*');
					}
					System.out.println();
				}
			}
		}
		else System.out.println("INPUT ERROR!");
	}

}
