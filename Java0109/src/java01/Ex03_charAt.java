package java01;

public class Ex03_charAt
{

	public static void main(String[] args)
	{
		String str = "3";
		System.out.println(str.charAt(0) - '0');  //3 ->charAt때문에 문자열로 보는 것.
		//아스키코드표에서 '3'은 51번, '0'은 48번이기 때문에 51-48 = 3이 나온다. 그래서 - '0'을 한다. 

		System.out.println('3' - '0' + 1);	//4
		System.out.println(Integer.parseInt("3") + 1);  //4
		
		System.out.println("3" + 1);	//31 -> '3'문자열은 +이 연결연산자가 되기 때문에 '31'이 된다.
		System.out.println(3 + '0');	//51 -> 숫자가 먼저 나와 '0'은 아스키코드값 48로 바뀌어 3 + 48 = 51이 된다.
	}

}
