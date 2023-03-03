package Java02.base.Math;

public class Ex01
{

	public static void main(String[] args)
	{
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		System.out.println("2의 3승 : " + Math.pow(2, 3));
		System.out.println("log2(8) : " + baseLog(8, 2));
		System.out.println(Math.PI);
		
	}
	
	public static double baseLog(int n1, int n2) {
		return Math.log(n1) / Math.log(n2);
	}

}

/* Math 클래스는 제공하는 필드와 메서드 모두 static이다. 즉, 기능제공이 목적인 클래스이다. (인스턴스 생성을 목적으로 하지 않는다.)
 * 
 * 
 * */
