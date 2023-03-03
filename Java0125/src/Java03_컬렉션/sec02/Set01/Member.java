package Java03_컬렉션.sec02.Set01;

import java.util.Objects;

public class Member
{
	public String name;
	public int age;
	
	Member(String n, int a){
		this.name = n;
		this.age = a;
	}

	//hashCode() 재정의 -> 이름과 나이가 같으면 동일한 hashCode 리턴
	//원래는 주소만으로 비교를해 동등 객체로 처리하지 않았다.
	@Override
	public int hashCode()
	{
		return name.hashCode() + age;
	}

	//equals() 재정의 -> 이름과 나이가 같으면 true가 리턴되도록 재정의
	@Override
	public boolean equals(Object obj)
	{
		Member member = (Member) obj;
		if(this.name.equals(member.name) && this.age == member.age) return true;
		else return false;
	}
	
	
}
