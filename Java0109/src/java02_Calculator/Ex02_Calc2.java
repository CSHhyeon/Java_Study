package java02_Calculator;

import java.util.Scanner;

public class Ex02_Calc2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//메뉴 기능 추가
			 System.out.println("사칙연산 기능을 선택하세요!");
			 System.out.println("1. 더하기");
			 System.out.println("2. 빼기");
			 System.out.println("3. 곱하기");
			 System.out.println("4. 나누기");
			 System.out.println("0. 끝내기");
			 
			 int n = sc.nextInt();
			 int num1 = 10;
			 int num2 = 20;
			 //사칙연산 로직 -> if는 차례대로 검사해서 내려가기 때문에 아래처럼 코딩해서 시간이 절약된다.
			 /*
			 if(n == 0) {
				 System.out.println("계산기를 종료합니다.");
				 break;
			 }
			 else{
				 if (n > 4) {
					 System.out.println("메뉴를 잘못 선택했습니다.");
					 continue;
				 }
				 
				 if(n == 1) {
					 System.out.println("1");
				 }
				 else if(n == 2) {
					 System.out.println("2");
				 }
				 else if(n == 3) {
					 System.out.println("3");
				 }
				 else if(n == 4) {
					 System.out.println("4");
				 }		 
			 }	
			 */
			 //switch문으로 변경해보기.
			 switch(n) {
			 case 0 :
				 System.out.println("계산기를 종료합니다.");
				 break;
			 case 1 :
				 System.out.println("1");
				 break;
			 case 2 :
				 System.out.println("2");
				 break;
			 case 3 :
				 System.out.println("3");
				 break;
			 case 4 :
				 System.out.println("4");
				 break;
			 default :
				 System.out.println("메뉴를 잘못 선택했습니다.");
				 break;
			 }
		}
	}
}
