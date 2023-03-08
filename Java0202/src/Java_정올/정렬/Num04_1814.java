package Java_정올.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num04_1814
{
	public static void main(String[] args)
	{
		ArrayList<Integer> insert = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//수열의 개수
		int num = 0;
		
		for(int i = 0; i < N; i++) {
			insert.add(sc.nextInt());
		}
		
		for(int i = 0; i < insert.size() - 1; i++) {
			for(int j = i + 1; j > 0; j--) {
				if(insert.get(j - 1) > insert.get(j)) {
					Collections.swap(insert, j - 1, j);
					num++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(num);
	}
}
