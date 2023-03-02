package Java01_반복문;

public class Ex04_369
{

	public static void main(String[] args)
	{
		//3의 배수인 경우 손뼉치는 프로그램
		for(int i = 1; i <= 100; i++) {
			System.out.printf("i = %d ", i);
			
			int tmp = i;
			do {
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) System.out.print("짝");
			}while((tmp /= 10) != 0); //tmp /= 10은 tmp = tmp / 10과 동일
			//tmp % 10 != 0을 안해주면 30, 40, 50, 60, 70등 10의 배수도 포함이 되어버린다.
			
			System.out.println();
		}
	}
}
