package Java03_문제풀기;

import java.util.Scanner;

public class Ex04
{

	public static void main(String[] args)
	{
		//정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
		//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		float average = 0;
		
		while(true) {
			int input = sc.nextInt();
			if(input >= 100) {
				num++;
				sum += input;
				average = sum / (float)num;
				
				System.out.printf("%d%n", sum);
				System.out.printf("%.1f%n", average);
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
