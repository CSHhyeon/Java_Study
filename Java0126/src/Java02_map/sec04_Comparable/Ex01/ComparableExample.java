package Java02_map.sec04_Comparable.Ex01;

import java.util.TreeSet;

public class ComparableExample
{
	public static void main(String[] args)
	{
		TreeSet<Person> treeset = new TreeSet<>();
		
		treeset.add(new Person("김멀티", 40));
		treeset.add(new Person("이멀티", 25));
		treeset.add(new Person("강멀티", 30));
		
		for(Person p : treeset) {
			System.out.println("이름 : " + p.name + ", 나이 : " + p.age);
		}
	}
}
