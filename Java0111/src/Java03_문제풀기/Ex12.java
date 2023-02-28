package Java03_문제풀기;

import java.util.Scanner;

public class Ex12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char alp = 'A';
		
		if(n >= 1 && n <= 6) {
			for(int i = 0; i < n; i++) {
				for(int j = n - i; j > 0; j--) {
					System.out.printf("%c", alp);
					alp += 1;
				}
				System.out.println();
			}
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}

	}

}
