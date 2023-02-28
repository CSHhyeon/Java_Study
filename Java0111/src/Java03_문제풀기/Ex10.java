package Java03_문제풀기;

import java.util.Scanner;

public class Ex10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1, sum = 0, num = 0;

		while(true) {
			if(sum >= n) break;
			else {
				if(i % 2 == 1){
					sum += i;
					num++;
				}		
				i++;
			}
		}
		System.out.printf("%d %d%n", num, sum);
	}

}
