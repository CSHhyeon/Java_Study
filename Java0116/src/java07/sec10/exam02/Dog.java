package java07.sec10.exam02;

public class Dog extends Animal {
	//추상 메소드 재정의
	@Override
	void sound()
	{
		System.out.println("멍멍!");
	}
}