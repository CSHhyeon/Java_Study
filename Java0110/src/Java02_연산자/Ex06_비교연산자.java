package Java02_연산자;

public class Ex06_비교연산자
{
	//비교연산자
	public static void main(String[] args)
	{
		//\t : tab, %b : boolean값 출력
		System.out.printf("10 == 10.0f \t %b%n", 10 == 10.0f); //true -> ==은 수가 같은지만 비교하기 때문에 10 == 10.0인 것이다.
		System.out.printf("'0' == 0 \t %b%n", '0' == 0);	  //false -> 문자열 0은 48이기 때문에
		System.out.printf("'\0' == 0 \t %b%n", '\0' == 0);	  //true -> '\0'은 null문자이다. 아스키코드표 상으로 NULL의 10진수는 0이다.
		System.out.printf("'A' == 65 \t %b%n", 'A' == 65);	  //true -> 문자열 'A'의 아스키코드는 65라서
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');	  //false -> 아스키코드표 상으로 'B'가 'A'보다 더 커서
		System.out.printf("'A' + 1 != 'B' \t %b%n", 'A' + 1 != 'B');	//false -> 아스키코드표 상으로 'B'가 'A'보다 1 더 커서
		
		/*
		 * 1. 대소비교 연산자 < > <= >= (두 오퍼랜드(Operend)의 값의 크기를 비교하는 연산자)
		 * 결과로 true / false를 리턴한다. -> 단, 기본형에서만 사용 가능
		 * 
		 * 2. 등가 비교 연산자 == != (기본, 참조형 모두에서 사용 가능)
		 * 기본형에서는 변수에 저장되어 있는 값이 같은지, 참조형에서는 객체의 주소값이 같은지를 비교한다.
		 * 두 값이 같으면 true, 두 값이 다르면 false를 리턴한다.
		 * */
	}

}
