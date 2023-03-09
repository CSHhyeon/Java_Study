package Java01_재귀.sec02_Factorial;

import java.util.Scanner;

public class DF
{
	//동적 계획법 활용 -> Heap 이용[TopDown]
	static int dynamic(int data) {
		int[] cache = new int[data + 1];
		cache[0] = 0;;
		cache[1] = 1;
		for(int index = 2; index < data + 1; index++) {
			cache[index] = cache[index - 1] + cache[index - 2];
		}
		return cache[data];
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(dynamic(N));
	}

}
