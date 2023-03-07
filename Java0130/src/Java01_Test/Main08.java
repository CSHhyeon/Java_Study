package Java01_Test;

import java.util.Scanner;

public class Main08
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		System.out.println("사각형의 높이 : ");
		int n = sc.nextInt();	//사각형의 높이
		if(n < 1 || n > 100) {
			do {
				System.out.println("100 이하의 정수값으로 입력하세요.");
				System.out.println("사각형의 높이 : ");
				n = sc.nextInt();
			}while(n < 1 || n > 100);
		}
		
		System.out.println("사각형의 너비 : ");
		int m = sc.nextInt();	//사각형의 너비
		if(m < 1 || m > 100) {
			do {
				System.out.println("100 이하의 정수값으로 입력하세요.");
				System.out.println("사각형의 너비 : ");
				m = sc.nextInt();
			}while(m < 1 || m > 100);
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}
}
