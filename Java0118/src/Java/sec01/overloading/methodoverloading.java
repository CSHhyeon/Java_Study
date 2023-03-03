package Java.sec01.overloading;

class A{
	void print() {
		System.out.println("A");
	}
}

class B extends A{
	void print() {
		System.out.println("B");
	}
}

public class methodoverloading
{
	public static void main(String[] args) {
		A a = new A();
		a.print();	//A
		
		B b = new B();
		b.print();	//B
		
		A ab = new B();
		ab.print();	//B	
	}
	
}
