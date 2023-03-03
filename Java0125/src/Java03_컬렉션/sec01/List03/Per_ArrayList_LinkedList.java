package Java03_컬렉션.sec01.List03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Per_ArrayList_LinkedList
{
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long start;
		long end;
		
		//ArrayList에 객체를 저장하는 시간 측정
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
			//list1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 객체 저장 시간 : " + (end - start) + "ns");
		
		//LinkedList에 객체를 저장하는 시간 측정 -> 더 빠르게 저장이 된다.
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 객체 저장 시간 : " + (end - start) + "ns");
	}
}
