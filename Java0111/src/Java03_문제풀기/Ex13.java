package Java03_문제풀기;

import java.util.Scanner;

public class Ex13
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		char alp = 'A';
		
		for(int i = 0; i < n; i++) {
			for(int j = n - i; j > 0; j--) {
				System.out.printf("%d ", num);
				num++;
			}
			for(int l = i + 1; l > 0; l--) {
				System.out.printf("%c ", alp);
				alp++;
			}
			System.out.println();
		}
	}
}
