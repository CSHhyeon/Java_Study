package Java02_정렬.sec03_삽입정렬;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> testData = new ArrayList<Integer>();
		
		for(int index = 0; index < 100; index++) {
			testData.add((int)(Math.random() * 100));
		}
		
		InsertionSort iSort = new InsertionSort();
		iSort.sort(testData);
	}
}
