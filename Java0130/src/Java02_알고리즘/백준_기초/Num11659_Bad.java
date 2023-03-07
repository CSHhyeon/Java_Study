package Java02_알고리즘.백준_기초;

import java.util.Scanner;

public class Num11659_Bad
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = 0, M = 0;
		int i = 0, j = 0;
		
		do {
			System.out.println("N : ");
			N = sc.nextInt();
		}while(N < 1 || N > 100000);
		
		do {
			System.out.println("M : ");
			M = sc.nextInt();
		}while(M < 1 || M > 100000);

		int[] num = new int[N];
		int[] sum = new int[M];
		int[][] arr = new int[2][M];
		
		System.out.println(N + "개 숫자 입력 : ");
		for(int x = 0; x < N; x++) {
			do {
				num[x] = sc.nextInt();
			}while(num[x] < 1 || num[x] > 1000);
		}
		
		for(int k = 0; k < M; k++) {
			do {
				System.out.println((k + 1) + "번째 i : ");
				i = sc.nextInt();
			}while(i < 1 || i > N);
			
			do {
				System.out.println((k + 1) + "번째 j : ");
				j = sc.nextInt();
			}while(j < i || j > N);
			arr[0][k] = i - 1;
			arr[1][k] = j - 1;
		}
		
		for(int a = 0; a < sum.length; a++) {
			for(int b = arr[0][a]; b <= arr[1][a]; b++) {
				sum[a] += num[b];
			}
		}
		
		for(int a = 0; a < sum.length; a++) {
			System.out.println(sum[a]);
		}
	}

}
