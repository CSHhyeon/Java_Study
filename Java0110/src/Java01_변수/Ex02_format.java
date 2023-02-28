package Java01_변수;
//printf() 출력함수

public class Ex02_format
{

	public static void main(String[] args)
	{
		float f1 = .10f;	//0.10  1.0e-1
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		
		//실수형 출력 사용 지시자 : %f %e(지수형) %g(값을 간략하게 표현)
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1); //f1 = 0.100000, 1.000000e-01, 0.100000
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2); //f2 = 10.000000, 1.000000e+01, 10.0000
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3); //f3 = 3140.000000, 3.140000e+03, 3140.00
		
		//%f 서식 문자는 소수 6자리까지만 표현하므로 7자리에서 반올림
		double d1 = 1.23456789;
		System.out.printf("d1 = %f%n", d1);	//d1 = 1.234568
		
		System.out.printf("[12345678901234567890]%n");	//[12345678901234567890]
		
		//%전체자리.소수점아래자리f
		//아래처럼 출력하면 뒤에 소수점 10자리를 00을 채워넣어 만들고 총 14개(. 포함)의 자리수가 되어야 하니 앞에 2번 공백이 생겼다. 
		System.out.printf("d1 = %14.10f%n", d1); //d1 =   1.2345678900
		System.out.printf("d1 = %014.10f%n", d1); //d1 = 001.2345678900 -> 014로 표현해 앞에 공백에 0 채워넣기
		
		//url 출력
		String url = "www.multiit.com";
		System.out.printf("[%s]%n", url);	 //[www.multiit.com]
		System.out.printf("[%20s]%n", url);	 //[     www.multiit.com] -> 20자 공간 확보 우측 정렬 출력
		System.out.printf("[%-20s]%n", url); //[www.multiit.com     ] -> 좌측 정렬
		System.out.printf("[%.8s]%n", url);  //[www.mult] -> 왼쪽에서부터 8자를 추출해내는 것
		
		//**스터디 모집하기! printf 출력 양식 심화 공부하여 정리하여 공유하기**
	}

}
