package Java02_연산자;

import java.util.Scanner;

public class Ex10_Quiz
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 하나 입력하세요!");
		String ch = sc.next();
		int num = ch.charAt(0); //키보드로부터 입력된 문자값 하나를 charAt(0)을 뽑아 저장
		//char ch = sc.next().charAt(0);
		
		if(num >= '0' && num <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		else if(num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	}
}
