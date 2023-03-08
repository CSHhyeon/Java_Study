package Java01_재귀.sec01_피보나치;

import java.util.Scanner;

public class Ex02_withArray
{
	public static void main(String[] args)
	{
		// 배열을 이용해 피보나치 수열 만들기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
				
		arr[0] = arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
				
		for(int print : arr) {
			System.out.printf("%d ", print);
		}		
	}
}
