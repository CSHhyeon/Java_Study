package Java_정올;

import java.util.Scanner;

public class Num04_3521
{
	public static void main(String[] args)
	{
		// 탐욕 알고리즘 -> 최대한 많이 배정받으려고 해서 탐욕이라고 한다.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];	//1, 2, 4, 8, 16그램 추의 개수
		int[] gram = {1, 2, 4, 8, 16};
		
		String input = sc.nextLine();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(input.split(" ")[i]);
		}
		
		int Weight = Integer.parseInt(input.split(" ")[5]);

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] * gram[i];
		}
		
		if(sum < Weight) {
			System.out.println("impossible");
		}
		else {
			int num = 0;
			int count = 0;
			
			for(int i = arr.length - 1; i >= 0; i--) {
				if(arr[i] != 0) {
					count = Weight / gram[i];
					if(count < arr[i]) {	//추의 개수가 충분할 때
						num += Weight / gram[i];
						Weight %= gram[i];
					}
					else {	//추의 개수가 모자랄 때
						num += arr[i];
						Weight -= arr[i] * gram[i];
					}
				}
			}
			System.out.println(num);
		}
	}
}
