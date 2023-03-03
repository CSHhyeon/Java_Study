package Java03_컬렉션.sec01.List01;

import java.util.ArrayList;
import java.util.List;

public class Ex01_Arraylist
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();	//리스트 : 순서있음, 중복허용
		
		//객체 저장
		list.add("1");
		list.add("1");
		list.add("2");
		
		//객체 참조
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			System.out.println();
		}
		
		list.remove(0);	//0번째인 1이 하나 삭제된다.
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			System.out.println();
		}
	}
}
