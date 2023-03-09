package Java02_정렬.sec01_병합정렬;

import java.util.ArrayList;

public class Split
{
	public void splitFunc(ArrayList<Integer> dataList) {
		if(dataList.size() <= 1) {
			return;
		}
		int medium = dataList.size() / 2;
		
		ArrayList<Integer> leftArr = new ArrayList<Integer>();
		ArrayList<Integer> rightArr = new ArrayList<Integer>();
		
		leftArr = new ArrayList<Integer>(dataList.subList(0, medium));	//0부터 medium까지
		rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size()));
		
		System.out.println(leftArr);
		System.out.println(rightArr);
	}
	
	public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList){
		if(dataList.size() <= 1) {
			return dataList;
		}
		int medium = dataList.size() / 2;
		
		ArrayList<Integer> leftArr = new ArrayList<Integer>();
		ArrayList<Integer> rightArr = new ArrayList<Integer>();
		
		leftArr = new ArrayList<Integer>(dataList.subList(0, medium));	//0부터 medium까지
		rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size()));
		
		return mergeFunc(leftArr, rightArr);
	}
	
	public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList){
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		int leftPoint = 0;
		int rightPoint = 0;
		
		//CASE1 : left/right 둘 다 있을 때
		//MergeSort.java로 볼 것!
		
		return mergedList;
	}
}
