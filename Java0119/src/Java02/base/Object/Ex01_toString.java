package Java02.base.Object;

class Book{
	String author;
	public String toString() {	//오버라이딩
		return author;
	}
}

//Object의 toString은 해당 인스턴스에 대한 정보를 문자열로 반환한다.
//각 클래스마다 자신의 기능에 맞도록 오버라이딩(재정의)되어 있다.
public class Ex01_toString //extends Object가 뒤에 생략되어 있는 것
{
	public static void main(String[] args)
	{
		String name = "김멀티";
		System.out.println(name.toString()); //name만해도 되는데 그 때 뒤에 .toString이 생략되어 있는 것이다.
		
		Object obj1 = new Object();
		System.out.println(obj1); //java.lang.Object@74a10858 -> getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		Book myBook = new Book();
		myBook.author = "홍자매";
		System.out.println(myBook.author); //홍자매
		System.out.println(myBook); //홍자매
	}
}
