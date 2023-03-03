package Java02.base.Arrays;

import java.util.Arrays;

class Person implements Comparable<Person>{  //오름차순 순서상 크고 작음에 대한 기준을 제공
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o)
	{
		Person p = o;
		int result = this.name.compareTo(p.name);  //이름을 비교하여 순서를 정하겠다는 의미.
		return result;  	 //같은 값이면 0, 비교 대상이 크면 음수, 비교 대상이 작으면 양수를 리턴
		
		/*
		 //나이순으로 정렬하는 결과 로직 구현
		if(this.age > p.age) return 1;
		else if(this.age < p.age) return -1;
		else return 0;
		//return this.age - o.age;
		 */
	}

	@Override
	public String toString()
	{
		//객체를 출력할 때 멤버변수를 이용하여 출력
		return name + " : " + age;
	}
}

public class Ex02_정렬
{
	public static void main(String[] args)
	{
		Person[] person = new Person[3];
		
		person[0] = new Person("이사랑", 24);
		person[1] = new Person("김사랑", 15);
		person[2] = new Person("최사랑", 29);
		
		Arrays.sort(person);
		for(Person p : person) {
			System.out.println(p);
		}
	}
}

/* 객체 저장 배열의 정렬
 * 1. 객체가 저장된 배열의 정렬은 저장된 데이터의 크기를 비교할 때, 어떤 기준으로 크기를 비교할 지 프로그래머가 정해줘야 한다.
 * 2. 기준을 정했으면 Comparable 인터페이스를 구현해주어야 한다.
 * */
