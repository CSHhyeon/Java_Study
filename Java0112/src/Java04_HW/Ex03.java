package Java04_HW;

import java.util.Scanner;

public class Ex03
{

	public static void main(String[] args)
	{
		// 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int i = 0, num = 1;
		
		while(true) {
			int input = sc.nextInt();
			if(input == 0) break;
			else {
				if(num % 2 == 0) {
					arr[i] = input;
					i++;
				}
			}
			num++;
		}
		for(int j =0; j < i; j++) {
			System.out.printf("%d ", arr[j]);
		}

	}

}
