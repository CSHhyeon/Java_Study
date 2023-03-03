package Homework.num04;

class Util{
	//타입 제한을 넣는다거나 제너릭까지 넣는건 못하겠네요ㅠ
	public static Integer getValue(Pair<String, Integer> pair, String key)
	{
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		}
		else return null;
	}   
}

public class UtilExample
{
	public static void main(String[] args)
	{
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
		/*
		OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
		int otherAge = Util.getValue(childPair, "홍삼원");
		System.out.println(otherAge);
		*/
	}
}
