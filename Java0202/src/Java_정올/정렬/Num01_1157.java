package Java_정올.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num01_1157
{
	public static void main(String[] args)
	{
		ArrayList<Integer> bubble = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//수열의 길이
		
		for(int i = 0; i < N; i++) {
			bubble.add(sc.nextInt());
		}
		
		for(int i = 0; i < bubble.size() - 1; i++) {
			for(int j = 0; j < bubble.size() - 1; j++) {
				if(bubble.get(j) > bubble.get(j + 1)) {
					Collections.swap(bubble, j, j + 1);
				}
			}
			
			for(int print : bubble) {
				System.out.print(print + " ");
			}
			System.out.println();
		}
	}
}
