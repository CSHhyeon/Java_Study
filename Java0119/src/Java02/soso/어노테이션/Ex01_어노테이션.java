package Java02.soso.어노테이션;

interface Unit{
	@Deprecated	//move에 일자로 줄이 생긴다.
	public void move(String str);
	public void run(String str);
}

class Zugg implements Unit{
	@Override  //오버라이딩 되었다는 것! 프로그램과 프로그래머에게 이미 있는 코드라는 것을 알려준다.
	@SuppressWarnings(value = {"deprecation"})
	public void move(String str)
	{
		System.out.println(str + "움직여라!");
	}

	@Override
	public void run(String str)
	{
		System.out.println(str + "뛰어라!");
	}
}

public class Ex01_어노테이션
{
	@SuppressWarnings(value = {"deprecation"})
	public static void main(String[] args)
	{
		Unit zugg = new Zugg();
		zugg.move("zugg 유닛이 이동합니다.");
		zugg.run("zugg 달려!");
	}
}

/* 자바 어노테이션은 자바소스 코드에 추가하여 사용할 수 있는 메타데이터의 일종이다.
 * @기호 java5부터 추가된 내용
 * @Override
 * @Deprecated : 문제의 소지가 있거나 호환된 것이 있기 때문에 사라질 가능성이 있으므로 가능하면 쓰지 마라는 의미
 * @SuppressWarning
 * */
