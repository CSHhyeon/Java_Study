package Java01_탐색.sec01_순차탐색_BFS;

import java.util.ArrayList;

public class SequencialSearch
{
	public int searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
		for(int index = 0; index < dataList.size(); index++) {
			if(dataList.get(index) == searchItem) {
				return index;
			}
		}
		return -1;
	}
}
