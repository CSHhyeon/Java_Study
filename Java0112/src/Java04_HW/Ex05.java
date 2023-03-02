package Java04_HW;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex05
{

	public static void main(String[] args)
	{
		// 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		if(n > 20) System.out.println("잘못된 입력입니다.");
		else {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			for(int i = 1; i <= arr.length; i++) {
				System.out.printf("%d ", arr[arr.length - i]);
			}
		}

	}

}
