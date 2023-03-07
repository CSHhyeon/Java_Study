package Java01_Test;

import java.util.Scanner;

public class Main02
{
	public static void main(String[] args)
	{
		//5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 정수의 합을 출력
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(arr[0] + arr[2] + arr[4]);
	}
}
