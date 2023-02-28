package Java02_연산자;

public class Ex03_문자타입
{
	//문자 타입과 숫자 타입과의 관계를 이용
	public static void main(String[] args)
	{
		char c1 = 'a';	//97 저장
		char c2 = c1;	//값을 복사한다.
		char c3 = ' ';	//문자변수의 초기값은 공백으로 준다.
		
		int i = c1 + 1;	//문자타입은 숫자와 동일한 취급을 받는다. 즉, 'a' + 1 = 97 + 1 = 98
		System.out.printf("%d%n", i);	//98
		
		c3 = (char)(c1 + 1);
		System.out.printf("%c%n", c3);	//b -> a 다음 값인 b가 나왔다.
		c2++;
		c3++;
		System.out.printf("%c%n", c2);	//b
		System.out.printf("%c%n", c3);	//c
	}

}
