package Java01_변수;

public class Ex03_Overflow
{

	public static void main(String[] args)
	{
		//Overflow : 지정된 값의 범위를 넘다.
		short sMin = -32768;
		byte b = 127;
		System.out.printf("b = %d%n", b);		//127
		
		b = (byte)(b + 1);	//casting해라. -> 형 변환을 시켜라. b + 1의 소속을 결정해라.
		System.out.printf("b + 1 = %d%n", b);	//-128
		
		b = (byte)(b + 1);
		System.out.printf("b + 1 = %d%n", b);	//-127 -> 하나하나씩 증가하고 있다.
		
		b = (byte)(b - 3);
		System.out.printf("b - 3 = %d%n", b);	//126
	}
}
