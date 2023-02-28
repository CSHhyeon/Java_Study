package java02_Calculator;

import java.util.Scanner;	//Scanner 클래스를 사용하기 위해 import 한 것.

class Calculator{
	int n1, n2;
}

public class Ex01_Calc
{

	public static void main(String[] args)
	{
		//대문자로 시작하면 클래스이다. Scanner은 시스템에서 제공한 클래스이다.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하고 엔터를 치세요.");
		int n1 = sc.nextInt();	//정수형 값을 변환해 n1에 대입. -> 사용자가 입력한 값.
		
		System.out.println("두 번째 숫자를 입력하고 엔터를 치세요.");
		int n2 = sc.nextInt();
		
		//2단계 : +, -, *, /, % 결과를 result 변수에 저장하고 출력
		int result[] = {n1+n2, n1-n2, n1*n2, n1/n2, n1%n2};
		for(int i = 0; i < 5; i++) {
			System.out.println(result[i]);
		}
	}

}
