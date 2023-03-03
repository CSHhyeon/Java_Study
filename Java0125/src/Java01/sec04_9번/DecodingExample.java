package Java01.sec04_9번;

public class DecodingExample
{
	//String 클래스 생성자 확인하여 적용
	public static void main(String[] args)
	{
		byte[] bytes = {-20, -107, -120, -21, -123, -107};
		String str = new String(bytes);
		System.out.println("str: " + str);
		
	}
}
