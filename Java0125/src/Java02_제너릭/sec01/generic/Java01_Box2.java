package Java02_제너릭.sec01.generic;

class Box2 <T>{	//T : 타입파라미터는 암묵적으로 Object로 간주되므로 Object 클래스의 메소드를 호출
	public T content;
	
	//Box의 내용물이 같은지를 비교
	public boolean compare(Box2<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}

public class Java01_Box2
{
	public static void main(String[] args)
	{
		Box2 box1 = new Box2();
		box1.content = 100;
		
		Box2 box2 = new Box2();
		box2.content = 100;
		
		Box2 box3 = new Box2();
		box3.content = "100";
		
		boolean result = box1.compare(box2);
		System.out.println("result ==> " + result);  //true
		boolean result2 = box1.compare(box3);
		System.out.println("result ==> " + result2); //false -> 박스 내용물을 비교할 수 있다.
	}
}
