package Java02_연산자;

public class Ex07_String_중요
{
	//문자열비교
	public static void main(String[] args)
	{
		/*
		 * 문자열 ==> String 객체 참조형 타입
		 * 기본형 문자열에서는 값이 같은지를 비교할 때 ==를 사용하고,
		 * 참조형 문자열에서 값이 같은지를 비교할 때에는 equals() 메소드를 사용한다.
		 * 
		 * 자바의 스트링 객체의 값은 불변이다. 한 번 저장된 값은 절대 변하지 않는다.
		 * 문자열에 덮어쓰기를 하는 것이 문자열 자체의 값이 바뀌는 것이 아니라 해당 문자열이 가리키는 주소가 바뀌는 것이다.
		 */
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = new String("abc");	//Heap에 저장한 문자열

		System.out.println(str1 == str2); //false -> str1에는 "abc"가, str2에는 "abc"가 저장되어 있는 힙 영역 주소가 저장되어 있다.
		System.out.println(str1.hashCode());	//96354
		System.out.println(str2.hashCode());	//96354
		
		System.out.println(str1 == str2);		//false -> 주소값을 비교
		System.out.println(str1.equals(str2));	//true -> 각 주소값에 들어가있는 '값'을 비교
		System.out.println(str2.equals(str1));	//true
		
		System.out.println(str2 == str3);		//false -> 같은 값이 들어가 있어도 서로 주소는 다르기 때문에 false
		System.out.println(str2.equals(str3));	//true -> 각 주소 안에 들어가 있는 값만을 비교
		
		//set -> 중복을 허용하지 않는 자료구조
	}

}
