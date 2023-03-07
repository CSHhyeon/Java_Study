package Java02_알고리즘.백준_기초;

import java.util.Scanner;

public class Num1546	//브론즈1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int sum = 0;
		float result = 0;
		
		do {
			N = sc.nextInt();
		}while(N > 1000 || N < 0);
		
		int[] score = new int[N];
		
		for(int i = 0; i < N; i++) {
			do {
				System.out.println((i + 1) + "번째 점수 : ");	//백준에서 이거 있으면 틀렸다고 나옴
				score[i] = sc.nextInt();
			}while(score[i] < 0 || score[i] > 100);
		}
		
		int M = score[0];
		for(int i = 0; i < score.length; i++) {
			if(M < score[i]) {
				M = score[i];
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		result = sum * 100 / M / (float)N;
		System.out.println(result);
	}
}
