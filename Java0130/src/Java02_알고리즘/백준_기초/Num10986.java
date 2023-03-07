package Java02_알고리즘.백준_기초;

import java.util.Scanner;

public class Num10986
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(sum % M == 0) num++;
			}
			sum = 0;
		}
		System.out.println(num);
	}
}
