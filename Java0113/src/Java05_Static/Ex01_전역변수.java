package Java05_Static;

class Cat{
	static int a = 5;
	int num = 3;
	
	void printValue(int num) {
		this.num = num;
		System.out.println("num" + this.num);
		System.out.println("a :" + a);
	}
}


public class Ex01_전역변수
{
	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + " " + num2);
		
		Cat cat = new Cat(); //stack에 영역을 생성해 Heap으로 레퍼런스가 된다.(인스턴스화)
		cat.num = 1;
		cat.a = 10;
		cat.printValue(20);
		System.out.println(cat.num);
		System.out.println(cat.a);
		
		Cat cat1 = new Cat(); //stack에 영역을 생성해 Heap으로 레퍼런스가 된다.(인스턴스화)
		cat1.num = 2;
		cat1.a = 11;
		cat1.printValue(30);
		System.out.println(cat1.num);
		System.out.println(cat1.a);
		

	}

}
