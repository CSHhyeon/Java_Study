package Java04_JVM;

public class Ex02_MemoryHeap1
{

	public static void main(String[] args)
	{
		Book book1 = new Book();
		Book book2 = new Book();
		
		System.out.println(book1.num);
		System.out.println(book2.num);
		
		//System.gc(); : Garbage Collection 수행을 명령하는 메소드
		//GC가 발생하면, 소멸의 대상이 되는 인스턴스는 결정되지만 이것이 실제 소멸로 바로 이어지지는 않는다.
		//왜냐하면 인스턴스의 실제 소멸로 이어지지 않은 상태에서 프로그램이 종료될 수도 있다. 종료되면 어차피 인스턴스는 소멸되기 때문이다.
		System.runFinalization();  //GC에 의해서 소멸이 결정된 인스턴스를 즉시 소멸시키는 메소드
		
	}

}
