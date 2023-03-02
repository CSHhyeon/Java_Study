package Java04_HW;

import java.util.Scanner;

public class Ex01
{

	public static void main(String[] args)
	{
		// 문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 10개를 입력하세요.");
		
		char[] arr = new char[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		
		for(char k: arr) {
			System.out.printf("%c", k);
		}
		
		
	}

}
