package Java01_탐색.sec02_이진탐색;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(2);
		data.add(3);
		data.add(8);
		data.add(12);
		data.add(20);

		BinarySearch bSearch = new BinarySearch();
		System.out.println("9 존재 여부 : " + bSearch.searchFunc(data, 9));
		System.out.println("12 존재 여부 : " + bSearch.searchFunc(data, 12));
	}
}
