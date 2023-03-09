package Java02_정렬.sec02_퀵정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JUNG_3518
{
	static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
		if(arr.size() <= 1) return arr;
		
		int pivot = arr.get(arr.size() - 1);
		ArrayList<Integer> small = new ArrayList<Integer>();
		ArrayList<Integer> big = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.size() - 1; i++) {
			if(arr.get(i) < pivot) {
				small.add(arr.get(i));
			}
			else{
				big.add(arr.get(i));
			}
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.addAll(quickSort(small));
		result.addAll(Arrays.asList(pivot));
		result.addAll(quickSort(big));
		
		return result;
	}
	
	static void merge() {
		
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> quick = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 	//배열의 사이즈
		for(int i = 0; i < N; i++) {
			quick.add(sc.nextInt());
		}
		
		quick = quickSort(quick);
		for(int print : quick) {
			System.out.printf("%d ", print);
		}
	}
}
