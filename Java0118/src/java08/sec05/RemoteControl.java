package java08.sec05;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;	//public static final이 생략된 것
	int MIN_VOLUME = 0;

	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//디폴트 인스턴스 메소드[예외] : 상수를 읽거나 추상메소드를 호출하는 코드. default라고 쓰는 것은 인터페이스에서만이다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			//추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}