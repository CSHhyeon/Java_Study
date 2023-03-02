package java06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		//공간에 대한 형태만 지정되어 있다.
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}

/*클래스의 용도 정의
 * - 라이브러리 클래스 : 실행할 수는 없으며 다른 클래스에서 이용하는 클래스  -> ex) StudentExample.java
 * - 실행클래스 : main() 메소드를 가지고 있는 실행 가능한 클래스		   -> ex) Student.java
 * */
 