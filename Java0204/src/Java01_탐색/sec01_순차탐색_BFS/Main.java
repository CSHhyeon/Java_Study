package Java01_탐색.sec01_순차탐색_BFS;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> testData = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			testData.add((int)(Math.random() * 100));
		}
		
		SequencialSearch sSearch = new SequencialSearch();
		System.out.println(sSearch.searchFunc(testData, 89));
	}
}
