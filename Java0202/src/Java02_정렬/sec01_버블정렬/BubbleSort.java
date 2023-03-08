package Java02_정렬.sec01_버블정렬;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort
{
	public ArrayList<Integer> sort(ArrayList<Integer> dataList){
		for(int index = 0; index < dataList.size() - 1; index++) {
			boolean swap = false;
			
			for(int index2 = 0; index2 < dataList.size() - 1 - index; index2++) {
				if(dataList.get(index2) > dataList.get(index2 + 1)) {
					Collections.swap(dataList, index2, index2 + 1);
					swap = true;
				}
			}
			
			if(swap == false) {
				break;
			}
		}
		return dataList;
	}
}

	//1. for(int index = 0; index < dataList.size() - 1; index++)) 반복
	//2. swap = false(교환이 되었는지를 확인하는 변수를 두자)
	//3. 반복문 안의 반복문으로 n-1번 반복
	//4. 반복문 안의 반복문 안에서 if(dataList.get(index2) > dataList.get(index2 + 1))이면
	//5. 데이터를 스왑하고, Collection.swap(dataList, index2, index2 + 1);
	//6. 스왑했음을 체크하기 위해, swap을 true로 놓고,
	//7. 반복문 안의 반복문을 수행 후에도 swap이 false이면, 전체 반복을 멈춤(break)
