package Java03_문제풀기;

import java.util.Scanner;

public class Ex03
{

	public static void main(String[] args)
	{
		// 정수를 계속 입력을 받다가 0이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 둘째자리까지 출력한다.)
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		float average = 0;
		
		while(true) {
			int input = sc.nextInt();
			if(input == 0) {
				System.out.printf("입력된 자료의 개수 = %d%n", num);
				System.out.printf("입력된 자료의 합계 = %d%n", sum);
				System.out.printf("입력된 자료의 평균 = %.2f%n", average);
				break;
			}
			else {
				num++;
				sum += input;
				average = sum / (float)num;
			}
		}
	}

}
