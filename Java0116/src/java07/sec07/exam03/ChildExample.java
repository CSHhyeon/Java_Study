package java07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//parent.method3(); -> 호출 불가능. 호출 가능하게 강제 형변환시키자.
		
		//강제 타입 변환 -> 얘를 조금 더 많이 사용한다.
		Child child = (Child)parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
	}
}