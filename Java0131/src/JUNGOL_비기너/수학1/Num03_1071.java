package JUNGOL_비기너.수학1;

import java.util.Scanner;

public class Num03_1071
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//정수의 개수
		int n = sc.nextInt();
		
		//n개의 정수 -> 여기에 m의 약수와 배수가 있는지 찾는 것
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//약수와 배수를 구할 정수
		int m = sc.nextInt();
		int divisorSum = 0;		//약수
		int multipleSum = 0; 	//배수
		
		for(int i = 0; i < arr.length; i++) {
			if(m % arr[i] == 0) divisorSum += arr[i];
			if(arr[i] % m == 0) multipleSum += arr[i];
		}
		
		System.out.println(divisorSum);
		System.out.println(multipleSum);
	}
}
