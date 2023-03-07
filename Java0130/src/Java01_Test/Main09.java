package Java01_Test;

import java.util.Scanner;

public class Main09
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char alpha = 'A';
		char start = 'A';
		
		System.out.println("삼각형의 높이 : ");
		int N = sc.nextInt();	//삼각형의 높이
		if(N < 1 || N > 100) {
			do {
				System.out.println("100 이하의 정수값으로 입력하세요.");
				System.out.println("삼각형의 높이 : ");
				N = sc.nextInt();
			}while(N < 1 || N > 100);
		}

		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < N - i; j++) {
				System.out.print("  ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print(alpha + " ");
				alpha += (N - k);
				if(alpha > 'Z') {
					alpha -= 26;
				}
			}
			alpha = ++start;
			if(alpha > 'Z') {
				alpha = 'A';
			}
			System.out.println();
		}
	}
}
