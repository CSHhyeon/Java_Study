package Java01_Test;

import java.util.Scanner;

public class Main01
{
	public static void main(String[] args)
	{
		// 10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		char[] arr = new char[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - 1 - i] + " ");
		}
	}
}
