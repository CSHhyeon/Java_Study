package Java03_배열;

import java.util.Scanner;

public class Ex02
{

	public static void main(String[] args)
	{
		//퀴즈 : 사용자에게 10개의 점수를 입력받아서 배열 score에 저장한 후 각 저장된 값을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 명의 학생 점수를 입력하시겠습니까?");
		int n = sc.nextInt();
		int[] score = new int[n];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] = %d%n", i, score[i]);
		}

		//print와 println은 문자열만을 처리한다. printf는 format을 지정하고 원하는 출력을 할 수 있다.
	}

}
