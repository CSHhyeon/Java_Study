package Java01_반복문;

import java.util.Scanner;

public class Ex02_do_while
{

	public static void main(String[] args)
	{
		String input = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		
		//문장을 받아서 출력하는 프로그램(문자 x나 대문자 X가 입력되기 전까지)
		do {
			input = in.next();
			System.out.println(input);
		}while(!input.equalsIgnoreCase("X"));	//X가 아닌 동안에 동작하라는 것이였기 때문!
		
		//만약 !를 붙이지 않으면 한번만 동작한다.
	}
}
