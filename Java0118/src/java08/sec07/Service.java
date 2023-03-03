package java08.sec07;

public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();	//디폴트 메소드 내부이기 때문에 호출 가능
		//staticCommon(); -> private 호출 가능
	}

	//private 메소드 : 디폴트 메소드 안에서만 호출이 가능함
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
		//staticCommon(); -> 또 다른 private 호출 가능
	}

	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}

	//private 정적 메소드 : 구현 객체가 필요없는 메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
}

//private 메소드의 용도 : 디폴트와 정적메소드들의 중복 코드를 줄이는 용도