package Java03_문제풀기;

import java.util.Scanner;

public class Ex06
{

	public static void main(String[] args)
	{
		int base = 0, height = 0;
		float width = 0;
		char answer = 'Y';
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(answer == 'Y' || answer == 'y') {
				System.out.println("Base = ");
				base = sc.nextInt();
				System.out.println("Height = ");
				height = sc.nextInt();
				width = base * height / (float)2;
				System.out.printf("Triangle width = %.1f%n", width);
				System.out.println("Continue?");
				answer = sc.next().charAt(0);
			}
			else break;
		}
		

	}

}
