package Java03_문제풀기;

import java.util.Scanner;

public class Ex07
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int score = 0, sum = 0;
		float avg = 0;
		
		if(num > 10) {
			System.out.println("잘못된 입력입니다.");
		}
		else {
			int i = 0;
			while(i < num) {
				score = sc.nextInt();
				sum += score;
				i++;
			}
			avg = sum / (float)num;
			System.out.println("avg : " + avg);
			
			if(avg >= 80) System.out.println("pass");
			else System.out.println("fail");
		}
	}

}
