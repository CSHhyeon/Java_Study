package Java01_연산자;
 
public class Ex03_equals
{

	public static void main(String[] args)
	{
		String str1 = "abc";
		System.out.println(str1.length());	  //3
		System.out.println(str1.hashCode());  //96354
		String str2 = str1;
		String str = "abc";
		System.out.println(str2.hashCode() + " " + str2.length());  //96354 3
		
		String str3 = new String("abc");
		String str4 = str3;
		System.out.println(str3.hashCode());  //96354
		System.out.println(str4.hashCode());  //96354
		
		System.out.println(str1 == str2);	//true -> str2에 str1을 넣었으니 주소를 같이 공유
		System.out.println(str1 == str3);	//false -> str3은 객체형이므로 주소가 다르다.
		System.out.println(str1 == str);   //true
		
		//equals()메소드는 내용과 대소문자 모두 비교한다.
		System.out.println(str1.equals("ABC"));	//false -> 대소문자 구분함. abc != ABC인 것.
		System.out.println(str1.equalsIgnoreCase("ABC"));	//true -> 대소문자 구분 안함.
		
		//equals()로 null 체크하는 방법 -> 굉장히 많이 사용된다. 매우 중요!!!
		String str5 = "2";
		String str6 = "";
		
		if(!"".equals(str5)) {	//str5가 공백이 아니라면
			System.out.println("str5는 공백이 아닙니다.");
		}else {
			System.out.println("str5는 공백입니다.");
		}
		
		if("".equals(str6)) {
			System.out.println("str6는 공백입니다.");
		}else {
			System.out.println("str6는 공백이 아닙니다.");
		}
		
	}

}
