package Java03_컬렉션.sec02.Set01;
import java.util.HashSet;
import java.util.Set;

public class MemberEx
{
	public static void main(String[] args)
	{
		Set<Member> set = new HashSet<>();
		
		//set에서 중복을 처리해준다.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("저장객체 수 : " + set.size());
	}
}
