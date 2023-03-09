package Java01_재귀.sec01_Queen;

import java.util.Scanner;

public class Back_9663
{
	static int num;
	static boolean[] flag;
	static boolean[] flag_a;
	static boolean[] flag_b;
	static int[] pos;
	
	static void print() {
		for(int i = 0; i < pos.length; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	static void set(int N, int i) {
		for(int j = 0; j < N; j++) {
			if(!flag[j] && !flag_a[i + j] && !flag_b[i - j + N - 1]) {
				pos[i] = j;
				if(i == N - 1) {
					num++;
				}
				else {
					flag[j] = flag_a[i + j] = flag_b[i - j + N - 1] = true;
					set(N, i + 1);
					flag[j] = flag_a[i + j] = flag_b[i - j + N - 1] = false;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//N * N 체스판 위에 퀸 N개
		
		flag = new boolean[N];
		flag_a = new boolean[2 * N - 1];
		flag_b = new boolean[2 * N - 1];
		pos = new int[N];
		
		set(N, 0);
		System.out.println(num);
	}
}
