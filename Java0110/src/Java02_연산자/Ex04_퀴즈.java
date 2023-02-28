package Java02_연산자;

public class Ex04_퀴즈
{

	public static void main(String[] args)
	{
		char ch = 'a';
		for(int i = 0; i < 26; i++) {
			System.out.printf("%c ", ch++);
		}
		
		System.out.println();//줄바꿈
		
		//대문자 'A' ~ 'Z' 가로, 세로 출력
		ch = 'A';
		for(int i = 0; i < 26; i++) {
			System.out.printf("%c%n", ch++);
		}
		
		ch = 'A';
		for(int i = 0; i < 26; i++) {
			System.out.printf("%c ", ch++);
		}
		
		System.out.println();//줄바꿈
		
		//0부터 9까지의 문자 가로 출력
		char num = '0';
		for(int i = 0; i < 10; i++) {
			System.out.printf("%c ", num++);
		}
		
	}

}
