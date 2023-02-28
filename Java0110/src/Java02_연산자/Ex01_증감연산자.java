package Java02_연산자;

public class Ex01_증감연산자
{
	//증감연산자(단항연산자)
	public static void main(String[] args)
	{
		int i = 5;
		i++;	//i = i + 1;, ++i;로 써도 결과는 같다.
		System.out.println(i);	//6

		i = 5;
		++i;
		System.out.println(i);	//6
		
		i = 5;
		int j = 0;
		j = i++;	//후치증가 : 이 줄에서는 바뀌지 않고 그 다음 줄에서 바뀐다.
		System.out.println(j + " " + i);	//5 6
		
		//퀴즈 : 결과에 i = 6, j = 5 후에 i = 6, j = 6 출력
		i = 5; j = 5;
		j = i++;
		System.out.printf("j = i++ 실행 후 i = %d, j = %d%n", i, j);
		j = ++j;
		System.out.printf("j = ++j 실행 후 i = %d, j = %d%n", i, j);
		
		
	}

}
