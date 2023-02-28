package Java03_문제풀기;

import java.util.Scanner;

public class Ex05
{

	public static void main(String[] args)
	{
		//0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println(num);
				break;
			}
			else {
				if(input % 3 != 0 && input % 5 != 0) num++;
			}
		}
	}
}
