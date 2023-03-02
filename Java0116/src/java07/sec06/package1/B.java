package java07.sec06.package1;

public class B {
	//메소드 선언
	public void method() {
		A a = new A();		//o -> 같은 패키지라서 객체 생성해 직접 접근 가능
		a.field = "value"; 	//o
		a.method(); 			//o
	}
}