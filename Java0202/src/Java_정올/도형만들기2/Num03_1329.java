package Java_정올.도형만들기2;

import java.util.Scanner;

public class Num03_1329
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//삼각형의 높이 N
		
		if(N < 1 || N > 100 || N % 2 == 0) {
			System.out.println("INPUT ERROR!");
		}
		else {
			//N/2 + 1까지는 증가, 나머지 N/2는 그대로 감소
		}

	}
}
