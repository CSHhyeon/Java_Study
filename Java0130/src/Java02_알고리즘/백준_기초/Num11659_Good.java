package Java02_알고리즘.백준_기초;

import java.util.Scanner;

public class Num11659_Good
{
	public static void main(String[] args)
	{
		//합배열을 이용한 구간합
		Scanner in = new Scanner(System.in);
		//1. 숫자개수(N), 질의개수(M)
		int N = in.nextInt();
		int M = in.nextInt();
		
		//2. 숫자 개수만큼 합배열 생성
		int input = 0;
		int[] sum = new int[N + 1];
		sum[0] = 0;
		
		for(int i = 1; i <= N; i++) {
			input = in.nextInt();
			sum[i] = sum[i - 1] + input;
		}
		
		//3. 질의 개수만큼 반복하면서 질의 범위를 받고 구간합 출력
		int[][] arr = new int[2][M];
		for(int i = 0; i < M; i++) {
			arr[0][i] = in.nextInt();
			arr[1][i] = in.nextInt();
		}
		
		for(int i = 0; i < M; i++) {
			int result = sum[arr[1][i]] - sum[arr[0][i] - 1];
			System.out.println(result);
		}
	}
}
