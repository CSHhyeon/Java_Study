package java01;

public class Ex05
{

	public static void main(String[] args)
	{
		int x, y;	//변수 선언
		x = y = 3;	//y에 3이 저장된 후에, x에 3이 저장된다.
		System.out.println("x = " + x + ", y = " + y);
		System.out.printf("x = %d, y = %d%n", x, y);

		//증감연산자(++) 감소연산자(--) 실습
		int i = 5, j = 0;
		j = i++;
		System.out.println("j = i++; 실행 후, i =" + i + ", j = " + j); //j = i++; 실행 후, i =6, j = 5
		
		i=5; j=0;
		j = ++i;
		System.out.println("j = ++i; 실행 후, i =" + i + ", j = " + j); //j = ++i; 실행 후, i =6, j = 6
		
		i=5; j=0;
		System.out.println(j = i++); //5 -> 
		System.out.println(++i);	 //7
		System.out.println(i++);	 //7
		System.out.println(i);		 //8
	}

}
