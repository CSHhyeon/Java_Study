package Java04_HW;

import java.util.Scanner;

public class Ex08
{

	public static void main(String[] args)
	{
		// 2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][4];
		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		
		System.out.println("first array");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("second array");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr1[i][j] * arr2[i][j];
			}
		}
		
		for(int[] a: arr) {
			for(int c: a) {
				System.out.printf("%d ", c);
			}
			System.out.println();
		}

	}

}
