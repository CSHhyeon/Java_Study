package Java04_HW;

import java.util.Scanner;

public class Ex02
{

	public static void main(String[] args)
	{
		// 정수 10개를 입력받은 후 세 번째, 다섯 번째와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		System.out.println("정수 10개를 입력하세요.");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.printf("%d ", arr[2]);
		System.out.printf("%d ", arr[4]);
		System.out.printf("%d ", arr[9]);
	}

}
