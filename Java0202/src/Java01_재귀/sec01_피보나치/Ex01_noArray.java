package Java01_재귀.sec01_피보나치;

import java.util.Scanner;

public class Ex01_noArray
{
	public static void main(String[] args)
	{
		// 배열없이 반복문 for를 이용해 피보나치 수열 만들기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int prevPreNum = 1;	//전전항(n-2)
		int preNum = 1;		//전항(n-1)
		
		System.out.println(prevPreNum);
		System.out.println(preNum);
		
		for(int i = 3; i < N; i++) {
			int curNum = prevPreNum + preNum;	//현재 항(n)
			System.out.println(curNum + " ");
			
			prevPreNum = preNum;
			preNum = curNum;
		}
	}
}
