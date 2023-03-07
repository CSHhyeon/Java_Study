package Java02_알고리즘.백준_강사님;

import java.util.Scanner;

public class Back_11659
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

/*문제 분석
 * 수의 개수 N, 합을 구해야 하는 횟수 M(M은 최대 100,000)
 * 구간마다 합을 계산하면 시간이 오래걸린다. 합배열을 이용하자.
 * 
 * 1. 수의 개수 N 입력받기 ==> 그 후 합배열 생성
 *    S[i] = S[i - 1] + A[i]
 * 2. 구간 i~j가 주어지면 구간합을 구하는 공식을 적용
 *    S[j] - S[i - 1]
 *    즉, (2, 4)이면 구간합은 S[4] - S[1] = 9 -> i - 1이니 1이 들어간다.
 *    (5, 5)이면 구간합은 S[5] - S[4], (1, 3)이면 구간합은 S[3] - S[0] = 12
 * */
