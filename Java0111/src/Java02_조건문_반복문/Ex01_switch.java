package Java02_조건문_반복문;

import java.util.Scanner;

public class Ex01_switch
{

	public static void main(String[] args)
	{
		//사용자에게 A~C까지 문자를 입력받아 A이면 '우수회원', B이면 '일반회원', C이면 '게스트' 출력
		//단, switch를 사용해야 하고, 대소문자 구분없이 비교한다.
		//A~C(a~c)이외의 문자 입력일 경우 "다시 입력" 출력
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		switch(grade) {	//또는 여기서 grade.toUpperCase()를 사용하면 소문자가 다 대문자가 된다.
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		case 'C':
		case 'c':
			System.out.println("게스트");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		//equalsIgnoreCase() 사용
		String input = sc.next();
		char my_grade;
		if("A".equalsIgnoreCase(input)) my_grade = 'A';
		else if("B".equalsIgnoreCase(input)) my_grade = 'B';
		else if("C".equalsIgnoreCase(input)) my_grade = 'C';
		else my_grade = ' ';
		
		switch(my_grade) {	//또는 여기서 grade.toUpperCase()를 사용하면 소문자가 다 대문자가 된다.
		case 'A':
			System.out.println("우수회원");
			break;
		case 'B':
			System.out.println("일반회원");
			break;
		case 'C':
			System.out.println("게스트");
			break;
		default:
			System.out.println("다시 입력하세요.");
			break;
		}

	}
}
