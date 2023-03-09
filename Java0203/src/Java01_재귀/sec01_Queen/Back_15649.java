package Java01_재귀.sec01_Queen;

import java.util.Scanner;

public class Back_15649
{
	static boolean[] flag;
	static int[] arr;
	
	static void set(int N, int M, int depth) {
		if(depth == M) {
			for(int v : arr) {
				System.out.print(v + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!flag[i]) {
				flag[i] = true;
				arr[depth] = i + 1;
				set(N, M, depth + 1);
				flag[i] = false;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//1~N에서 자연수 선택(중복 X)
		int M = sc.nextInt();	//수열의 길이
		
		arr = new int[M];
		flag = new boolean[N];
		set(N, M ,0);
	}
}
