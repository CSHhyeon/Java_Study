package Homework;

import java.util.Scanner;

public class num1
{

	public static void main(String[] args)
	{
		// 1번. 서식 문자를 사용하여 출력시키기
		System.out.println("I can program well.");
		System.out.println("Dreams come true.");
		
		//2번. 합계
		int kor = 90, mat = 80, eng = 100;
		System.out.println("kor " + kor);
		System.out.println("mat " + mat);
		System.out.println("eng " + eng);
		int sum = kor + mat + eng;
		System.out.println("sum " + sum);
		
		//3번
		System.out.println("My height");
		System.out.printf("%d%n", 170);
		System.out.println("My weight");
		System.out.printf("%f%n", 68.6);
		
		//4번
		int num1 = 10, num2 = 20;
		System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
		num1 = 30; num2 = 40;
		System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
		
		//5번
		System.out.printf("%10s %10s %10s%n", "item", "count", "price");
		System.out.printf("%10s %10s %10s%n", "pen", "20", "100");
		System.out.printf("%10s %10s %10s%n", "note", "5", "95");
		System.out.printf("%10s %10s %10s%n", "eraser", "110", "97");
		
		//6번
		System.out.printf("원주 = 5 * 2 * 3.140000 = %f%n", 5 * 2 * 3.140000);
		System.out.printf("넓이 = 5 * 5 * 3.140000 = %f%n", 5 * 5 * 3.140000);
		
		//7번 : 나이로 키보드 입력받아 출력
		Scanner sc = new Scanner(System.in);
		System.out.printf("당신의 나이는 몇 살입니까?");
		int age = sc.nextInt();
		System.out.printf("%d%n", age);	
		
		//8번 : 세 개의 정수를 입력 받아 합계와 평균 출력(소수 이하 버리고 정수부분만 출력)
		System.out.println("첫 번째 수를 입력하고 엔터를 누르세요.");
		int input1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하고 엔터를 누르세요.");
		int input2 = sc.nextInt();
		System.out.println("세 번째 수를 입력하고 엔터를 누르세요.");
		int input3 = sc.nextInt();
		
		int sum3 = input1 + input2 + input3;
		float average = sum3 / 3;
		System.out.printf("합계 : %d, 평균 : %.0f%n", sum3, average);
		
		
	}
}
