package java07.sec10.exam02;

public abstract class Animal {
	//메소드 선언 -> 일반 메소드도 만들기 가능
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}

	//추상 메소드 선언
	abstract void sound();	//추상메소드->{}사용하지 않고, 이름만 만듦. 소리를 내는 것들을 편하게 관리하기 위함.
}