package java01;

public class Ex02_변수
{
	//화면에 내용 출력하는 예제
	//한 줄 주석 : ctrl + /, 여러줄 주석 ㅣ ctrl + shift = /, 해제 : ctrl + shift + \
	public static void main(String[] args)
	{
		//main 메소드는 클래스 내에서 '실행부'를 구동시키기 위한 역할을 한다.
		//홍길동 줄바뀜 - 전우치 줄안바뀜 - 손오공 줄안바뀜 기능으로 출력하기. -> F11누르면 디버깅
		System.out.println("홍길동");
		System.out.print("전우치");
		System.out.print("손오공");
		System.out.println();	//한줄 띄기
		
		/* 변수명 표기법 Rule
		 * 첫 번째 문자는 소문자로 쓰고 다음 문자부터는 대문자로 쓴다. -> 카멜 표기법
		 * mymathscore(X) myMathScore(O) my_Math_Score(O)
		 * 변수는 위에 적은 것처럼 맨 앞은 소문자, 두 번째 단어부터는 시작을 대문자로 표기한다.
		 * myMathScore은 '카멜 표기법', my_Math_Score은 '스네이크 표기법'이다.
		 * 
		 * 클래스 표기법 -> 첫 글자를 '대문자'로 시작한다.
		 * */
		
		//변수와 상수
		//1.기본 타입 변수(정수형 변수)
		byte num1 = 1;	//1비트
		short num2 = 1;	//2비트
		int num3 = 1;	//4비트
		long num4 = 1;	//8비트
		System.out.println(num1);
		
		//2.문자형 -> 싱글 쿼테이션일 때 char를 사용한다.
		char ch1 = 'A';
		System.out.println(ch1);
		char ch2 = 65;	//문자형에 숫자값 넣기
		System.out.println(ch2);	//65는 A의 10진값이다. 그래서 A가 출력된다. 자바가 인코딩함.
		char ch3 = 0x41;
		System.out.println(ch3);	//A 나온다. 0x는 16진수를 의미.
		char ch4 = 0b000000100001;
		System.out.println(ch4);	//! 나온다. 0b 표기법은 이진수를 의미.
		
		//3.논리형
		boolean check1 = true;
		boolean check2 = false;
		boolean check3 = (1 < 2);
		System.out.println(check1);	//true
		System.out.println(check2);	//false
		System.out.println(check3);	//true
		
		//4.실수형 -> float, double
		double num5 = 1.01;
		System.out.println(num5);
		
		//퀴즈1 : myMathScore 변수에 100 저장.
		int myMathScore = 100;
		int myEngScore = 99;
		double myAverage = 99.5;
		String myName = "홍길동";	//String은 클래스이고, 기본 타입이 아니다. 문자열은 String 클래스로 처리한다.
		
		System.out.println(myMathScore);	
		System.out.println(myEngScore);	
		System.out.println(myAverage);
		System.out.println(myName);
		
		//퀴즈2 : 정수형 변수 num1, num2를 선언하고 각각 10, 20을 할당한 후 정수형
		int number1 = 10;
		int number2 = 20;
		int number3 = number1 + number2;
		System.out.println(number3);
	}

}
