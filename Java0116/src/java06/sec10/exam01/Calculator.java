package java06.sec10.exam01;

public class Calculator {
	String color;	//인스턴스 필드 -> 실행 클래스에서 사용 시 new로 객체화 시켜 접근해야 한다.
	static double pi = 3.14159; 	 //정적필드

	static int plus(int x, int y) {  //정적메소드
		return x + y;
	}
	
	static int minus(int x, int y) { //정적메소드
		return x - y;
	}
}


/* static 클래스, 필드, 메소드 앞에 선언
 * 정적 필드, 정적 메소드, 정적 클래스(공용 클래스, 공용 필드, 공용 메서드 라고도 한다.)
 * -> 외부에서 직접 접근이 가능하다.
 * -> 즉, new로 인스턴스화(객체화)를 할 필요 없다.
 * -> 단, 너무 남발하면 시스템에 과부하가 온다.
 */