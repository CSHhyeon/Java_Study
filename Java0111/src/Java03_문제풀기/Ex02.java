package Java03_문제풀기;

import java.util.Scanner;

public class Ex02
{

	public static void main(String[] args)
	{
		// 점수를 입력받아 80점 이상이면 합격메시지를 그렇지 않으면 불합격 메시지를 출력하는 작업을 반복하다가 0~100점 이외의 점수가 입력되면 종료하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("점수를 입력하세요.");
			int score = sc.nextInt();
			
			if(score >= 0 && score <= 100) {
				if(score >= 80) System.out.println("축하합니다. 합격입니다.");
				else System.out.println("죄송합니다. 불합격입니다.");
			}
			else{
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
