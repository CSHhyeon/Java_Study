package Java02_제너릭.sec02.num01_genericmethod;

public class BoxEx
{
	public static<T> Box<T> boxing(T t){ 	//boxing이라는 제너릭 메소드
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);	//100이라는 값을 넣는다.
		int value = box1.get();
		System.out.println(value);
		
		//제너릭메소드 boxing을 이용해 "피노키오인형"을 박싱한 후 박스를 열어 언박싱하기.
		Box<String> box2 = boxing("피노키오인형");	//-> 박싱메소드가 알아서 짐을 싼다.
		String toy = box2.get();
		System.out.println(toy);
	}
}
