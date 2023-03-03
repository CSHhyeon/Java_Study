package Homework.num02;

class Container<T>{
	public T t;
	
	public void set(T input) {
		this.t = input;
	}
	
	public T get() {
		System.out.println(this.t);
		return this.t;
	}
}

public class ContainerExample
{
	public static void main(String[] args)
	{
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}
