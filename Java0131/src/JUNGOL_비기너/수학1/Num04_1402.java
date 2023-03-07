package JUNGOL_비기너.수학1;

import java.util.Scanner;

public class Num04_1402
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int num = 1;
		int cnt = 0;
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				cnt++;
				if(cnt == K) {
					System.out.println(i);
					break;
				}
			}
		}
		
		if(cnt < K) System.out.println("0");
	}
}
