package Java01_재귀.sec01_피보나치;

import java.util.Scanner;

public class Ex03_Function
{
	private static int[] result = new int[100];
	private static int fibo(int n) {
		if(result[n] != 0) {	
			//이미 계산되어 결과가 있으므로 기존값 리턴
		}
		else {	//처음 계산하는 부분
			if(n < 2) {
				result[n] = 1;
			}
			else {
				//재귀
				result[n] = fibo(n - 1) + fibo(n - 2);
			}
		}
		return result[n];
	}
	
	public static void main(String[] args)
	{
		// Recursive(재귀)
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		fibo(N);
		for(int n : result) {
			System.out.printf(n + " ");
		}
	}
}

/* 1. 계산된 결과를 받을 수 있도록 'result 배열' 생성
 * 2. 재귀적으로 수행할 fibo()메소드 생성
 * 3. 처음 계산하는 경우와 이미 계산한 경우를 나눠서 구현
 *   - 이미 계산한 적 있는 경우 result 배열에 값이 있는 경우, 그대로 반환
 *   - 처음 계산하는 경우, 계산한 뒤 result 배열에 저장하고 반환
 * */
 