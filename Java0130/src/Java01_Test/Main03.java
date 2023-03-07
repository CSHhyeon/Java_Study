package Java01_Test;

import java.util.Scanner;

public class Main03
{
	public static void main(String[] args)
	{
		// 10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i % 2 == 0) oddSum += arr[i];
			else evenSum += arr[i];
		}
		
		System.out.println("odd : " + oddSum);
		System.out.println("even : " + evenSum);

	}
}
