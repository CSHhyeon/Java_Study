package Java01_재귀.sec02_Factorial;

import java.util.Scanner;

public class Factorial
{
	//아래 recursive call를 이용하면 쓸데없는 것을 반복한다.[BottomUp]
	static int fact(int data) {
		if(data <= 1) {
			return data;
		}
		return fact(data - 1) + fact(data - 2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//n까지 출력
		
		System.out.println(fact(n));
	}
}
