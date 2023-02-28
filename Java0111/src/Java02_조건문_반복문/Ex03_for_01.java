package Java02_조건문_반복문;

public class Ex03_for_01
{

	public static void main(String[] args)
	{
		//1. 1부터 100을 가로로출력하는 for 프로그램 작성
		for(int i = 1; i < 101; i++) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		//2. 1부터 100까지의 합을 출력하는 for 프로그램 작성
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.printf("1부터 100까지의 합 : %d%n", sum);
		
		//3. 1부터 100까지 수 중 2의 배수의 합을 출력하는 for 프로그램을 작성하세요.
		sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				sum += i;
			}		
		}
		System.out.printf("1부터 100까지의 수 중 2의 배수의 합 : %d%n", sum);
	}

}
