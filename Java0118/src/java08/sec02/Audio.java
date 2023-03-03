package java08.sec02;

public class Audio implements RemoteControl {  //implements는 리모콘 인터페이스를 Audio 클래스에서 사용하겠다는 것
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
}