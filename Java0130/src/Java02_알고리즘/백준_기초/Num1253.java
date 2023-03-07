package Java02_알고리즘.백준_기초;

import java.util.Scanner;

public class Num1253
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//1. 수의 개수, 수들 입력
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		//두 개의 수를 더할 수 있는 경우의 수
		int now = 0;
		int num = N * (N - 1);
		int[] add = new int[num];
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				add[now] = i + j;
				now++;
			}
		}
		
		//Good인 것의 개수 출력
		int good = 0;
		for(int i = 0; i < add.length; i++) {
			for(int str : arr) {
				if(str == add[i]) good++;
			}
		}
		
		System.out.println(good);
	}
}
