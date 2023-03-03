package Java02.base.Object;

import java.util.ArrayList;

class Author implements Cloneable{
	private String bookname;
	private ArrayList<String> owner = new ArrayList<String>();	//<String> : String값만 담겠다는 의미
	
	
	public String getBookname()
	{
		return bookname;
	}


	public void setBookname(String bookname)
	{
		this.bookname = bookname;
	}


	public ArrayList<String> getOwner()
	{
		return owner;
	}


	public void setOwner(String owner)
	{
		this.owner.add(owner);
	}

	public String toString() {
		return "책 제목 : " + bookname;
	}
	
	public Object clone() {
		try {
			Author cloneBook = (Author)super.clone();	//shallow copy 상태, 배열이나 인스턴스인 필드가 복제된 것이 아닌 주소값만을 복제
			cloneBook.owner = (ArrayList)owner.clone(); //정확한 복제를 위해서는 배열이나 인스턴스의 필드를 추가하여 재정의해주어야 한다.
			return cloneBook;  
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		finally {}
	}
}

public class Ex03_clone
{
	public static void main(String[] args)
	{
		//clone() : 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환.
		//단, 주소값만을 복제한다. 그 내부에 들어있는 값은 복제하지 않는다. [얕은 복사]
		/* Object의 clone() 메소드는 '얕은 복사' : 주소값만을 복사. 배열이나 인스턴스의 필드 값까지도 복제해야 하므로 적합하지 않다.
		 * 1. Cloneable 인터페이스를 구현한 클래스
		 * 2. clone() 메소드를 오버라이딩하여 사용
		 * */
		ArrayList<String> ownerlist = new ArrayList<String>();
		
		Author mybook1 = new Author();
		mybook1.setBookname("탈무드");
		mybook1.setOwner("김지영");
		mybook1.setOwner("이기쁨");
		
		ownerlist = mybook1.getOwner();
		for(String name1 : ownerlist) {
			System.out.println(name1);
		}
		
		System.out.println("===깊은 복사===");
		Author mybook2 = (Author)mybook1.clone(); //Object형을 Author형으로 다운캐스팅! 원래 clone()이 Object형이다.
		mybook2.setOwner("정지우");
		
		ownerlist = mybook2.getOwner();
		for(String name2 : ownerlist) {	//Cloneable과 clone() 오버라이딩을 이용해 '깊은 복사'를 하는 방법을 알려준 것.
			System.out.println(mybook2.getBookname() + " " + name2);
			//System.out.println(name2);  //깊은 복사
		}
	}
}
