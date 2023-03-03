package Java03_컬렉션.sec01.List01;

import java.util.LinkedList;
import java.util.List;

public class Ex02_Linkedlist
{
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>();
		
		list.add("orange");
		list.add("apple");
		list.add("pear");
		
		for(String fruit : list) {
			System.out.println(fruit);
		}
		System.out.println();
		
		list.remove(0);	//orange 삭제
		for(String fruit : list) {
			System.out.println(fruit);
		}
	}
}
