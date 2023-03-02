package java07.sec10.exam02;

public class Cat extends Animal {
	//추상 메소드 재정의 -> 강제.
	@Override
	void sound()
	{
		System.out.println("야옹!");
	}
}