package Java02_연산자;

public class Ex08_stringTest
{

	public static void main(String[] args)
	{
		String a = "abc";
		System.out.println("a의 시스템 상의 주소: " + System.identityHashCode(a)); //1956710488
		a = "bbc";
		System.out.println("a의 시스템 상의 주소: " + System.identityHashCode(a)); //603856241
		//주소가 바뀌는 것을 확인할 수 있다. 즉, 문자열 자체가 바뀌는 것이 아니라 가리키는 주소가 바뀌는 것이다.
		
		String b = "bbc";
		System.out.println("b의 시스템 상의 주소: " + System.identityHashCode(b)); //603856241
		b = "bbc";
		System.out.println("b의 시스템 상의 주소: " + System.identityHashCode(b)); //60385624
		b = "abc";
		System.out.println("b의 시스템 상의 주소: " + System.identityHashCode(b)); //1956710488
		//주소값을 보면 a에 문자열 넣은 곳의 주소를 가리킨다. 즉, 누군가가 주소를 관리하고 있다는 것을 알 수 있다.
		
		/* 위 실험을 통해 우리가 알 수 있었던 내용
		 * 
		 * 1) String 객체에 들어있는 문자열의 값이 바뀌면, String 값이 가리키는 주소가 바뀐다.
		 * 2) String 객체에 들어있는 문자열을 같은 값으로 재할당해도 String 값이 가리키는 주소는 그대로다.
		 * -> 즉, 문자열을 어딘가에 저장해 놓고 관리하고 있다는 것을 추론할 수 있다.
		 * set이라는 중복을 허용하지 않는 저장 공간 안에 넣고 관리한다는 것을 알 수 있다.
		 * 
		 * 내가 한 번 썼던 문자열들을 저장해놓은 저장소 ==> 스트링풀
		 * -> 중복으로 인한 객체 생성의 낭비를 줄일 수 있다.
		 * */
		
		String c = "Hello";
		String d = new String("Hello");
		
		System.out.println("c == d? : " + (c == d)); //false -> 주소는 완전히 다르니까..
		System.out.println("a == b.intern()? : " + (c == d.intern())); //true intern() -> 해당 문자열에 해당하는 값이 풀에 있는지 물어보는 메소드
	}

}
