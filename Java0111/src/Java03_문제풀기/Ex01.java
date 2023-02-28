package Java03_문제풀기;

import java.util.Scanner;

public class Ex01
{

	public static void main(String[] args)
	{
		// 100 이하의 양의 정수만 입력된다. for문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("100 이하의 양의 정수를 입력하세요.");
		int input = sc.nextInt();
		int sum = 0;
		if(input > 0 && input <= 100) {
			for(int i = 1; i < input + 1; i++) {
				sum += i;
			}
			System.out.printf("1부터 %d까지의 합은 : %d%n", input, sum);
		}
		else System.out.println("잘못된 입력입니다.");

	}

}
