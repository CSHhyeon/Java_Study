package Java02_map.sec04_Comparable.Ex01;

public class Person implements Comparable<Person>  //사용자 정의 클래스라서 정렬안된다. 그래서 우리가 Comparable을 만들어주어야 한다.
{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//age 오름차순 정렬 만들기
	@Override
	public int compareTo(Person o)	//같으면 0. 작으면 음수, 크면 양수
	{
		if(this.age == o.age) return 0;
		else {
			if(this.age > o.age) return 1;
			else return -1;
		}
	}
	
}
