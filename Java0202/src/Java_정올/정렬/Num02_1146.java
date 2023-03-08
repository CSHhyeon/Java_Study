package Java_정올.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num02_1146
{
	public static void main(String[] args)
	{
		ArrayList<Integer> select = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//수열의 길이
		
		for(int i = 0; i < N; i++) {
			select.add(sc.nextInt());
		}
		
		int temp = 0;
		int index = 0;
		
		for(int i = 0; i < select.size() - 1; i++) {
			index = i;
			
			for(int j = i + 1; j < select.size(); j++) {
				if(select.get(index) > select.get(j)){
					index = j;
				}
			}
			Collections.swap(select, index, i);
			
			for(int print : select) {
				System.out.printf("%d ", print);
			}
			System.out.println();
		}
	}
}
