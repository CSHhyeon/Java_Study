package java01;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

//printf() : 출력포맷메소드
public class Ex04_printf
{

	public static void main(String[] args)
	{
		/*System.out.printf("출력포맷", 출력할 내용);
		 * 
		 * %s => String 형식
		 * %d => 정수형식
		 * %n => 줄바꿈
		 * %f => 실수형(float, double)
		 * %t => date, time 형식
		 * %o => 8진수 정수의 형식 출력
		 * %x => 16진수 정수의 형식 출력
		 * %e -> 지수 표현의 형식 출력
		 * %b => boolean 형식 출력
		 * */
		
		String hello = "Hello";
		String world = "World!";
		System.out.printf("%s %s %n", hello, world);
		
		System.out.printf("(%20s) %n", hello);	//%20s는 앞에 20칸을 띄었다는 의미. -> (               Hello)
		System.out.printf("(%-20s) %n", hello);	//%-20s는 뒤에 20칸을 띄었다는 의미. -> (Hello               )
		
		//[정수, 실수 출력]
		//1) 123.456000출력, 2) 123.46 출력, 3) 1.23e+02 출력, 4) 100 출력, 5)065 출력
		System.out.printf("%f%n", 123.456);	//123.456000 -> float은 기본적으로 소수점 6자리까지 보여준다.
		System.out.printf("%5.2f%n", 123.456); //123.46 -> %5.2f -> 5자리까지 표현하고, 소수점 두 번째자리까지 출력하겠다.
		
		System.out.printf("%5.2e%n", 123.456); //1.23e + 02
		System.out.printf("%e%n", 123.456); //1.234560e + 02
		
		System.out.printf("%03d%n", 100); 	//100
		System.out.printf("%03d%n", 10); 	//010 -> %03d는 세 자리를 표현하라는 의미.
		System.out.printf("%03d%n", 65); 	//065

		/*[시간 출력] Date 객체 -> 시간 정보를 가지고 있다.
		 * 시간 출력은 %t이다.
		 * 
		 * 퀴즈 - hours : 16, minutes : 30, seconds : 30
		 * Monday, January 2023 이런 식으로 출력할 수 있게 printf() 형태 구글링 후 출력코드 작성
		 * */
		
		//LocalDateTime now = LocalDateTime.of(2022, Month.JANUARY, 9, 16, 30, 30);
		Date now = new Date();
		System.out.printf("hour: %tH, minutes : %tM, seconds: %tS%n", now, now, now);
		System.out.printf("%tA, %tB %tY", now, now, now);
	}

}
