package Java02.soso.가변인수;

public class Ex01_가변인수
{
	public static void main(String[] args)
	{
		helloEverybody("홍길동");
		helloEverybody("홍길동", "신데렐라");
		helloEverybody("홍길동", "삼장법사", "손오공", "저팔계");

	}
	
	public static void helloEverybody(String ...string) { //바뀌는 인수 개수들을 다 받을 수 있다.
		for(String s: string) {
			System.out.print(s + '\t');
		}
		System.out.println();
	}
}

//내부적으로 어떻게 처리하는지! ...은 말줄임표이다.
//helloEverybody(new String[]{"홍길동"});
//helloEverybody(new String[]{"홍길동", "신데렐라"});
//helloEverybody(new String[]{"홍길동", "삼장법사", "손오공", "저팔계"});
//public static void helloEverybody(String[] strings){...}