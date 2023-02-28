package Homework;

import java.util.Scanner;

public class num2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//9번 : 5개의 정수를 입력 받아 연산 실행 후 출력
		System.out.println("더하기할 수를 입력하고 엔터를 누르세요.");
		int one = sc.nextInt();
		int add = one + 3;
		System.out.println("빼기할 수를 입력하고 엔터를 누르세요.");
		int two = sc.nextInt();
		int minus = two - 3;
		System.out.println("곱하기할 수를 입력하고 엔터를 누르세요.");
		int three = sc.nextInt();
		int multi = three * 3;
		System.out.println("나누기할 수를 입력하고 엔터를 누르세요.");
		int four = sc.nextInt();
		int divi = four / 3;
		System.out.println("나머지 구할 수를 입력하고 엔터를 누르세요.");
		int five = sc.nextInt();
		int rest = five % 3;
		System.out.printf("더하기 : %d, 빼기 : %d, 곱하기 : %d, 나누기 : %d, 나머지 : %d%n", add, minus, multi, divi, rest);
		
		
		//10번 : 정수형 변수 a, b를 만들고 각각 10으로 초기화한 후 출력
		int a = 10, b = 10;
		System.out.printf("최초값 a = %d, b = %d%n", a, b); 
		System.out.println();
		System.out.printf("a++ = %d, ++b = %d%n", a++, ++b);  
		System.out.printf("실행후 a = %d, b = %d%n", a, b);
		System.out.println();
		System.out.printf("a-- = %d, --b = %d%n", a--, --b); 
		System.out.printf("실행후 a = %d, b = %d%n", a, b); 
		
		
		//11번 : 후치증가 연산자, 전치 감소 연산자 이용
		System.out.println("첫 번째 값을 입력 후 엔터하세요.");
		int first = sc.nextInt();
		System.out.println("두 번째 값을 입력 후 엔터하세요.");
		int second = sc.nextInt();
		int multiply = first++ * --second;
		System.out.printf("%d %d %d%n", first, second, multiply);
		
		//12번 : 첫 번째 수에는 100 증가시켜 저장, 두 번째 수는 10으로 나눈 나머지를 저장
		System.out.println("첫 번째 값을 입력 후 엔터하세요.");
		int fir = sc.nextInt();
		int up = fir + 100;
		System.out.println("두 번째 값을 입력 후 엔터하세요.");
		int sec = sc.nextInt();
		int down = sec % 10;
		System.out.printf("첫 번째 값 : %d, 두 번째 값 : %d%n", up, down);
	}

}
