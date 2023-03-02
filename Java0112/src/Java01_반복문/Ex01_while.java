package Java01_반복문;

public class Ex01_while
{

	public static void main(String[] args)
	{
		//1번 구구단을 while로 작성(2단부터 9단까지)
		int i = 2;
		while(i < 10) {
			int j = 1;
			while(j < 10) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
				j++;
			}
			i++;
		}
		
		//2번 10부터 1까지 가로로 출력(while)
		int l = 10;
		while(l > 0) {
			System.out.printf("%d ", l);
			l--;
		}
		
		/* int i = 10;
		 * while(i >= 1) System.out.print(i-- + " "); 
		 * */
	}

}
