package Java04_HW;

public class Ex06
{

	public static void main(String[] args)
	{
		// 피보나치 수열이란 첫 번째 항과 두 번째 항만 1이고 나머지 항은 바로 앞의 두 항의 합과 같은 수열을 말한다.
		// 각 항의 값을 계산하는 다음의 예를 보고 피보나치 수열의 10, 20, 30, 40항의 값을 출력하는 프로그램을 작성하시오.
		int[] arr = new int[50];
		arr[0] = arr[1] = 1;
		
		for(int i = 2; i < 50; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		System.out.printf("10번 항: %d, 20번 항: %d, 30번 항: %d, 40번 항: %d%n", arr[9], arr[19], arr[29], arr[39]);
	}

}
