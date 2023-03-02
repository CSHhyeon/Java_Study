package Java03_AccessModifier;

import java.util.Scanner;

public class Ex02_QuiaMain
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("현재 듣고 있는 과정명을 입력하세요.");
		String sub = sc.next();
		System.out.println("교육비를 입력하세요.");
		int fee = sc.nextInt();
		
		Ex02_Quiz s1 = new Ex02_Quiz(name, sub, fee);
		s1.calcReturnFee();
		s1.print();

	}

}
