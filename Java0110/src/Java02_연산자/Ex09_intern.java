package Java02_연산자;

public class Ex09_intern
{

	public static void main(String[] args)
	{
		String a = "apple";
		String b = new String("apple");
		String c = "apple";
		String d = new String("apple");
		
		System.out.println(a == b);	//false
		System.out.println(a == c);	//true
		
		/*
		 * 첫 번째 줄에서 String a가 생성될 떄 'apple'은 리터럴 문자열이므로 Heap 영역 중에서 String Pool에 위치하게 된다.
		 * 두 번째 줄에서 String b는 new 연산자를 통해 객체를 생성한다. 즉, Heap 영엿에 위치하지만 String Pool이 아닌 다른 주소값을 참조한다.
		 * '=='연산자는 같은 메모리를 참조하는가를 비교한다. 그래서 a==b는 false를 반환한다.
		 * c는 'apple'을 String Pool에 넣으려고 보니 이미 'apple'이 존재한다.
		 * 그러면 c는 a와 같은 String Pool의 'apple'을 가리키게 된다. a, c가 같은 값을 참조하니 a=c는 true가 나온다.
		 * */
		
		String e = b.intern();
		System.out.println(a == b);	//false
		System.out.println(a == e); //true
		
		/*
		 * intern() 메서드는 String Pool에서 리터럴 문자열이 이미 존재하는지 체크한 뒤
		 * 존재하면 해당 문자열을 반환하고, 아니면 리터럴을 String Pool에 넣어준다.
		 * 즉, e는 b의 값인 'apple'이 String Pool에 이미 존재하는지를 찾고, 이미 존재하므로 해당 문자열을 반환해 e = 'apple'이 된다.
		 * 그러면 a와 e는 결국 같은 주소를 참조하게 되어 a = e는 true가 된다.
		 * */

	}

}
