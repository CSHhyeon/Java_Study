package Java01_변수;

public class Ex04_Casting
{

	public static void main(String[] args)
	{
		//Casting : 형(Data Type) 변환
		double d = 85.4;
		int score = (int)d;	//down casting[강제 캐스팅] : 기존 사이즈를 줄인다. 자료 손실이 100% 있다.
		System.out.printf("%d%n", score);	//85
		
		int s = 95555;
		byte b1 = (byte)s;
		System.out.printf("%d%n", b1);	//67 -> 알 수 없는 값이 나옴.. 심각한 손상.
		
		//upcasting[자동 캐스팅] : 자료 손실 없음. down casting만 손실 100%
		short s1 = b1;	//자동 캐스팅된다. (short) b1인데 short가 생략되어도 된다.
		System.out.printf("%d%n", s1);
		
		//char(문자) <==> 정수
		char ch = 'A';	//char ch = 65;와 동일 'A' = 65니까!
		int code = ch;	
		System.out.printf("%c %d%n", ch, code);	//A 65
		
		code = (int)ch;	//ch에 저장된 값을 int 타입으로 변환하여 저장
		System.out.printf("%c = %d (%#X)%n", ch, code, code);  //A 65 (0x41)
	}

}
