package JUNGOL_비기너.수학1;

import java.util.Arrays;
import java.util.Scanner;

public class Num07_1002
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		
		for(int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		
		int BigDivi = getDivi(input[0], input[1]);
		int SmallMulti = input[0] * input[1] / BigDivi;
		for(int i = 1; i < N - 1; i++) {
			BigDivi = getDivi(BigDivi, input[i+1]);
			SmallMulti = SmallMulti * input[i+1] / getDivi(SmallMulti, input[i+1]);
		}
		
		System.out.printf("%d %d", BigDivi, SmallMulti);
	}
	
	public static int getDivi(int X, int Y) {
		int[] arr = new int[10000];
		int cnt = 0;
		
		for(int i = 1; i <= (int)Math.sqrt(X); i++) {
			if(X % i == 0) {
				arr[cnt++] = i;
				
				if(X / i != i) {
					arr[cnt++] = X / i;
				}
			}
		}
		
		int[] result = new int[cnt];
		for(int i = 0; i < result.length; i++) {
			result[i] = arr[i];
		}
		
		Arrays.sort(result);
		
		int BigDivi = 0;
		for(int i = 0; i < result.length; i++) {
			if(Y % result[i] == 0) BigDivi = result[i];
		}
		return BigDivi;
	}
}
