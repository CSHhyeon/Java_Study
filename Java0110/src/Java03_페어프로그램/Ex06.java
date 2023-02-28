package Java03_페어프로그램;

import java.util.Scanner;

public class Ex06
{

	public static void main(String[] args)
	{
		// 두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int divi = a / b;
		int rest = a % b;
		
		System.out.printf("%d / %d = %d...%d", a, b, divi, rest);
	}

}
