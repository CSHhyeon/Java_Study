package Java01_Test;

import java.util.Scanner;

public class Main07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 시작 범위 : ");
		int s = sc.nextInt();	//구구단의 시작 범위
		if(s < 2 || s > 9) {
			do {
				System.out.println("INPUT ERROR! 2부터 9 사이의 정수를 입력하세요.");
				System.out.println("구구단 시작 범위 : ");
				s = sc.nextInt();
			}while(s < 2 || s > 9);
		}
		
		System.out.println("구구단 끝 범위 : ");
		int e = sc.nextInt();	//구구단의 끝 범위
		if(e < 2 || e > 9) {
			do {
				System.out.println("INPUT ERROR! 2부터 9 사이의 정수를 입력하세요.");
				System.out.println("구구단 끝 범위 : ");
				e = sc.nextInt();
			}while(e < 2 || e > 9);
		}
		
		int min = s;
		int max = e;
		if(s > e) {
			min = e;
			max = s;
		}
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j < max - min + 1; j++) {
				if(s > e) {
					System.out.print((s - j) + " * " + i + " = " + ((s - j) * i) + "\t");
				}
				else {
					System.out.print((s + j) + " * " + i + " = " + ((s + j) * i) + "\t");
				}
			}
			System.out.println();
		}
	}
}
