package JUNGOL_비기너.수학1;

import java.util.Arrays;
import java.util.Scanner;

public class Num05_2809
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[10000];
		int cnt = 0;
	
		for(int i = 1; i <= (int)Math.sqrt(N); i++) {
			if(N % i == 0) {
				arr[cnt++] = i;
				
				if(N / i != i) {
					arr[cnt++] = N / i;
				}
			}
		}
		
		int[] divisor = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			divisor[i] = arr[i];
		}
		
		Arrays.sort(divisor);
		
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%d ", divisor[i]);
		}
	}
}
