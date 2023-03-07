package Java02_알고리즘.백준_기초;

import java.util.Arrays;
import java.util.Scanner;

public class Num2750
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];

		for(int i = 0; i < arr.length; i++){
		    arr[i] = sc.nextInt();
		    if(arr[i] < 1 || arr[i] > 1000) i--;
		}

		/*
		//1번 방법
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		//2번 방법
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
