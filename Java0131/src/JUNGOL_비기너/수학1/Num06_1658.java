package JUNGOL_비기너.수학1;

import java.util.Arrays;
import java.util.Scanner;

public class Num06_1658
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int[] diviX = getDivi(X);
		int BigDivi = 0;
		for(int i = 0; i < diviX.length; i++) {
			if(Y % diviX[i] == 0){
				BigDivi = diviX[i];
			}
		}
		
		int SmallMulti = X * Y / BigDivi;
		
		System.out.println(BigDivi);
		System.out.println(SmallMulti);
	}

	public static int[] getDivi(int input) {
		int cnt = 0;
		int[] arr = new int[10000];
		for(int i = 1; i <= (int)Math.sqrt(input); i++) {
			if(input % i == 0) {
				arr[cnt++] = i;
				if(input / i != i) {
					arr[cnt++] = input / i;
				}
			}
		}
		
		int[] result = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			result[i] = arr[i];
		}
		Arrays.sort(result);
		
		return result;
	}
}
