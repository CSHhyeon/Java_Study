package java08.sec06;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//디폴트 메소드
	default void setMute(boolean mute) {
		//이전 예제와 동일한 코드이므로 생략
	}

	//정적 메소드 -> static이기 때문에 구현객체없이 RemoteControl.changeBattery();로 인터페이스만으로 직접 호출이 가능하다.
	static void changeBattery() {	//public이 생략되어 있다. 앞에 private도 가능하긴 하다. 언제 가능한지 나중에 설명할 것.
		System.out.println("리모콘 건전지를 교환합니다.");
	}
	
	//주의할 점 : 상수필드를 제외한 추상메소드나 디폴트 메소드, private 메소드는 호출 불가! why? 구현객체가 필요한 인스턴스 메소드이기 때문! 
}