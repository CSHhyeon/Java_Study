package Java_정올.재귀;

//재귀함수 공부
import java.util.Scanner;

public class Num01_1309
{
	public static long fact(int n) {
		if(n <= 1) {
			System.out.println("1! = 1");
			return n;
		}
		else {
			System.out.println(n + "! = " + n + " * " + (n-1) + "!");
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//1~15의 수
		System.out.println(fact(n));
		
	}
}
