package Java03_컬렉션.sec02.Set02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1
{

	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Java");	//중복객체를 저장하지 않음
		
		//저장된 객체 수 출력
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();	//iterator : 반복자
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("Java")) {
				iterator.remove();
			}
		}
		System.out.println();
		
		for(String element : set) {
			System.out.println(element);
		}
	}

}
