package JUNGOL_비기너.수학1;

import java.util.Scanner;

public class Num02_1430
{
	public static void main(String[] args)
	{	
		int[] arr = new int[10];	//0~9
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int multi = A * B * C;
		
		do {
			i = multi % 10;
			arr[i]++;
			multi /= 10;
		}while(multi != 0);

		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
