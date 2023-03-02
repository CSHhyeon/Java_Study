package Java04_HW;

import java.util.Scanner;

public class Ex04
{

	public static void main(String[] args)
	{
		// 연도와 월을 입력받아 해당 월의 날 수를 출력하다가 월이 0이면 종료하는 프로그램을 작성하시오. (월이 잘못 입력되면 "잘못 입력하였습니다."를 출력한다.)
		// 윤년은 2월이 29일까지 있는 연도, 평년은 2월이 28일까지 있는 해이다.
		Scanner sc = new Scanner(System.in);
		int year, month = 0;
		
		while(true) {
			System.out.println();
			
			System.out.println("YEAR = ");
			year = sc.nextInt();
			System.out.println("MONTH = ");
			month = sc.nextInt();
			
			if(month == 0) break;
			else {
				if(month > 12) System.out.println("잘못 입력하였습니다.");
				else {
					if(month == 2) {	//윤년 vs 평년
						//4로 나누어떨어지면 윤년, 4로 나누어떨어지더라도 100으로 떨어지면 평년
						//4로 나누어떨어지고, 100으로 나누어 떨어지나, 400으로 나누어 떨어지면 윤년
						if(year % 4 == 0) {
							if(year % 100 == 0) {
								if(year % 400 == 0)System.out.println("입력하신 달의 날 수는 29일입니다."); //윤년
								else System.out.println("입력하신 달의 날 수는 28일입니다."); //평년
							}
							else { //4로 나누어떨어지고 100으로 나누어떨어지지 않으면 윤년
								System.out.println("입력하신 달의 날 수는 29일입니다.");
							}
						}
						else System.out.println("입력하신 달의 날 수는 28일입니다."); //평년
					}
					else if(month == 4 || month == 6 || month == 9 || month == 11) { //30일
						System.out.println("입력하신 달의 날 수는 30일입니다.");
					}
					else {	//1, 3, 5, 7, 8, 10, 12월 -> 31일
						System.out.println("입력하신 달의 날 수는 31일입니다.");
					}
				}
			}
		}

	}

}
