package java02_Calculator;

import java.util.Scanner;

public class Ex03_MyCalc
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			//메뉴 출력
			showMenu();
			
			//숫자로 메뉴 선택(0~4)
			//int num = sc.nextInt(); -> 권장하지 않음. 외부에서 들어오기 때문에 문자열이라서..
			char myChar = sc.next().charAt(0);
			if(!checkNum(myChar)) {	//유효성 검사
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;	//while로 돌아간다.
			}
			
			int num = myChar - '0';
			System.out.println(num);
			
			if (num == 0) break;
			else{
				if(num > 4) {
					System.out.println("메뉴를 잘못 선택했습니다.2");
	                continue;
				}
				
				// 더하기, 빼기, 곱하기, 나누기 실행
				System.out.print("첫 번째 숫자:");
				int num1 = sc.nextInt();
				System.out.print("두 번째 숫자:");
				int num2 = sc.nextInt();
				
				if (num == 1) addNum(num1, num2);
		        else if (num == 2) minusNum(num1, num2);
		        else if (num == 3) multiplyNum(num1, num2);       
		        else if (num == 4) divideNum(num1, num2);   
			}
		}
			System.out.println("계산기를 종료합니다.");	
	}
	
	public static void showMenu()
	{
		 System.out.println("사칙연산 기능을 선택하세요!");
		 System.out.println("1. 더하기");
		 System.out.println("2. 빼기");
		 System.out.println("3. 곱하기");
		 System.out.println("4. 나누기");
		 System.out.println("0. 끝내기");
	}
	
	public static boolean checkNum(char ch)
	{
		if(ch >= '0' && ch <= '9') {	//문자로 검사. charAt을 사용해서 가능!
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void addNum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void minusNum(int num1, int num2) {
		if(num1 > num2) System.out.println(num1 - num2);
		else System.out.println(num2 - num1);
	}
	
	public static void multiplyNum(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static void divideNum(int num1, int num2) {
		if(num2 == 0) System.out.println("분모에 0이 들어갈 수 없습니다.");
		else System.out.println(num1 / num2);
	}

}
