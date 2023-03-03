package java9.sec02.exam02;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		//finally는 생략 가능
		System.out.println();

		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}