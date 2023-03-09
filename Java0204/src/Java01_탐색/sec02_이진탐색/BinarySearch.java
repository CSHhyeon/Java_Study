package Java01_탐색.sec02_이진탐색;

import java.util.ArrayList;

public class BinarySearch	//이진탐색
{
	public boolean searchFunc(ArrayList<Integer> data_list, Integer find_data) {
		if(data_list.size() == 1 && find_data == data_list.get(0)) {
			return true;
		}
		if(data_list.size() == 1 && find_data != data_list.get(0)) {
			return false;
		}
		if(data_list.size() == 0) {
			return false;
		}
		
		int mid = data_list.size() / 2;
		
		if(find_data == data_list.get(mid)) {
			return true;
		}
		else {
			if(find_data < data_list.get(mid)) {
				return this.searchFunc(new ArrayList<Integer>(data_list.subList(0, mid)), find_data);
			}
			else {
				return this.searchFunc(new ArrayList<Integer>(data_list.subList(mid, data_list.size())), find_data);
			}
		}
	}
}
