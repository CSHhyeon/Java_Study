package Java_정올;

import java.util.ArrayList;
import java.util.Scanner;

public class Num01_3517_이진탐색
{
	public static int BinarySearch(ArrayList<Integer> arr, int findNum) {
		if(arr.size() == 0) return -1;
		if(arr.size() == 1 && arr.get(0) == findNum) return 0;
		if(arr.size() == 1 && arr.get(0) != findNum) return -1;
		
		//recursive ver
		//int mid = arr.size() / 2;
		
		//loop ver
		int low = 0;
		int high = arr.size();
		while (low <= high){
			int mid = (low + high) / 2;
			if(arr.get(mid) == findNum) {
				return mid;
			}
			else if(arr.get(mid) > findNum) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> find = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//입력할 수의 개수
		for(int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		
		int Q = sc.nextInt();	//찾아낼 수의 개수
		for(int i = 0; i < Q; i++) {
			find.add(sc.nextInt());
		}
		
		for(int i = 0; i < find.size(); i++) {
			System.out.printf("%d ", BinarySearch(arr, find.get(i)));
		}
	}
}
