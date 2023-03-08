package Java_정올.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num03_1158
{
	public static void main(String[] args)
	{
		ArrayList<Integer> insert = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//수열의 길이
		for(int i = 0; i < N; i++) {
			insert.add(sc.nextInt());
		}
		
		for(int i = 0; i < insert.size() - 1; i++) {
			for(int j = i + 1; j > 0; j--) {
				if(insert.get(j - 1) > insert.get(j)) {
					Collections.swap(insert, j - 1, j);
				}
				else {
					break;
				}
			}

			for(int print : insert) {
				System.out.printf("%d ", print);
			}
			System.out.println();
		}
	}
}
