package Java03_페어프로그램;

import java.util.Scanner;

public class Ex07
{
	public static void main(String[] args)
	{
		// 직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형 가로 길이를 입력하고 엔터하세요.");
		int a = sc.nextInt();
		int add = a + 5;

		System.out.println("직사각형 세로 길이를 입력하고 엔터하세요.");
		int b = sc.nextInt();
		int dble = b * 2;
		
		int area = add * dble;
		System.out.printf("width = %d%n", add);
		System.out.printf("length = %d%n", dble);
		System.out.printf("area = %d%n", area);
	}
}
