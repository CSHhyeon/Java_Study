package Java02_제너릭.sec01.generic;

class Box <T>{	//T : 타입파라미터. A라고 해도 된다. 타입파라미터는 암묵적으로 Object로 간주되므로 Object 클래스의 메소드를 호출
	public T content;
	
	//생성자
	public Box() {}
	
	public Box(T content) {
		content = content;
	}
}
//Box는 T가 무엇인지는 모르지만 Box가 생성될 시점에 다른 타입으로 대체된다는 것을 알고 있다.

public class Java01_BoxExample
{
	public static void main(String[] args)
	{
		Box<String> box = new Box<String>();	//여기서 T를 String이라고 정해준다. 단, 타입대체는 클래스 및 인터페이스만 가능하다.
		box.content = new String("코끼리장난감");
		//box.content = new Integer(1);
		
		//String toy = (String)box.content;
		String toy = box.content;	//<String>을 사용했기 때문에 String으로 강제 형변환하지 않아도 된다.
		System.out.println(toy);
		
		//어떤 내용물이 저장되어 있는지 모른다면 instanceof 연산자? 박스 안에 굉장히 많은 것들이 있음. 그래서 좋은 방법은 X 너무 일이 많음.
		//Box를 생성하기 전에 <T>를 이용해 타입을 지정해준다.
		
		Box<Integer> box1 = new Box<Integer>();	//기본타입은 타입 파라미터의 대체타입 불가! Wrapper 타입만 가능하다.
		box1.content = 100;
		int content = box1.content;
		System.out.println(content);
		
		Box<Integer> box2 = new Box<>();	//이런 식으로 뒤에 <>라고만 해도 된다. 앞에 있는 값이 들어가게 된다.
		
		//생성자 이용
		Box<String> box3 = new Box<String>("코끼리");
		Box<Integer> box4 = new Box<Integer>(3);
	} 
}
