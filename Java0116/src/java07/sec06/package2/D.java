package java07.sec06.package2;

import java07.sec06.package1.A;

public class D extends A {
	//생성자 선언
	public D() {
		super();	//A 생성자 호출
	}
	
	//메소드1 선언 
	public void method1() {
		this.field = "value"; //A의 필드에 접근 가능해짐
		this.method();	//A 클래스의 메소드 호출 가능
	}
	
	//메소드2 선언
	public void method2() {
		//A a = new A(); ->직접 객체를 생성해 접근하는 것은 불가능.
		//a.field = "value2";
		//a.method();  -> protected이기 때문에 직접 접근은 불가능해지는 것이다. [생성자 직접 호출 불가능]
	}
}

/* D 클래스는 A 클래스의 다른 패키지에 있지만 A의 자식 클래스이므로
 * A의 protected 필드, 생성자, 메소드에는 접근이 가능하다.
 * 하지만, 직접 객체를 생성하거나 필드에 값을 할당, 호출할 수는 없다.
 * 즉, 직접 호출은 안되고, 간접 호출은 가능하다는 것이다.
 * 
 * 자식 생성자에서 super()를 사용해 A() 생성자 호출이 가능해진다.
 * */
 