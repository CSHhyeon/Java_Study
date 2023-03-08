package Java_정올;

import java.util.Scanner;

public class Num03_1335
{
	public static void one(int N) {	//주사위를 N번 던져서 나올 수 있는 모든 경우
		if(N < 1) return;
		for(int i = 1; i <= 6; i++) {
			System.out.printf("%d ", i);
			one(N - 1);
			System.out.println();
		}
	}
	
	public static void two(int N) {	//주사위를 N번 던져 중복이 되는 경우의 수를 제외
		
	}

	public static void three(int N) {	//주사위를 N번 던져서 모두 다른 수가 나올 수 있는 경우
	
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//주사위를 던진 횟수
		int M = sc.nextInt();	//출력모양
		
		switch(M) {
		case 1 :
			one(N);
			break;
		case 2:
			two(N);
			break;
		case 3:
			three(N);
			break;
		}

	}

}
