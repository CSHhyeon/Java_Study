package Java02_정렬.sec02_선택정렬;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> testData = new ArrayList<Integer>();
		
		for(int i = 0; i < 100; i++) {
			testData.add((int)(Math.random() * 100));
		}
		SelectionSort sSort = new SelectionSort();
		sSort.sort(testData);
	}
}
