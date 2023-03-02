package java07.sec06.package2;

import java07.sec06.package1.A;  //가져왔어도 다른 패키지라서 접근 불가능

public class C {
	//메소드 선언
	public void method() {
		//A a = new A(); -> 같은 패키지가 아니라서 사용 불가능. A는 protected로 막혀있다.
		//a.field = "value"; -> 다른 패키지라서 불가능
		//a.method(); -> protected로 막혀있고, 다른 패키지라서 불가능
	}
	
}