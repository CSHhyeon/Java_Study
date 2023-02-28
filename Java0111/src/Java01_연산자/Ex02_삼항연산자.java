package Java01_연산자;
 
public class Ex02_삼항연산자
{
	public static void main(String[] args)
	{
		int x = -10;
		
		int absX = x >= 0 ? x : -x;
		System.out.println(absX);
	}
}
