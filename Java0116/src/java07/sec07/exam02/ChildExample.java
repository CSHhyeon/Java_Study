package java07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();

		//자동 타입 변환
		Parent parent = child;  //부모클래스에서 선언된 필드와 메소드만 접근이 가능하다.

		//자식 타입은 부모 타입으로 자동 형변환이 되지만, 부모는 자식으로 자동 형변환이 되지 않는다. 강제 형변환을 해야 한다.
		//메소드 호출
		parent.method1(); //Parent-method1() 호출
		parent.method2(); //Child-method2() 호출
		//parent.method3(); -> 호출 불가능!
	}
}
