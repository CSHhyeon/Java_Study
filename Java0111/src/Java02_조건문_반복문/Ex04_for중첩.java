package Java02_조건문_반복문;

import java.util.Scanner;

public class Ex04_for중첩
{

	public static void main(String[] args)
	{
		// 1. 2단부터 9단까지 출력하는 중첩 for문 작성
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
		//2. 사용자로부터 단(2~9단까지만 범위 제한)을 입력받아서 해당 단만 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요. (2~9단까지만 허용)");
		int input = sc.nextInt();
		if(input > 1 && input < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d%n", input, i, input*i);
			}
		}
		else System.out.println("잘못된 입력입니다.");
		
		/*
		//3. 사용자로부터 시작단과 끝단 (예 2~5) 받아서 해당 단만 출력
		System.out.println("시작단을 입력하세요.");
		int start = sc.nextInt();
		System.out.println("끝단을 입력하세요.");
		int finish = sc.nextInt();
		for(int i = start; i < finish + 1; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		*/
		
		//<처리조건, 출력형식> 보고 난 뒤
		int start = 2, end = 9;
		System.out.println("시작단을 입력하세요.");
		int a = sc.nextInt();
		System.out.println("끝단을 입력하세요.");
		int b = sc.nextInt();
		
		if(a > 1 && a < 10 && b > 1 && b < 10) {
			if(a == b) start = end = a;
			else {
				if(a > b) {
					start = b;
					end = a;
				}
				else {
					start = a;
					end = b;
				}
			}
			
			for(int i = start; i < end + 1; i++) {
				for(int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d   ", i, j, i*j);
				}
				System.out.println();
				System.out.println();
			}
		}
		else System.out.println("잘못된 입력입니다.");	
	}
}
