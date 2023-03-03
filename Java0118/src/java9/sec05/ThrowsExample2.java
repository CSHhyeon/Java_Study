package java9.sec05;

public class ThrowsExample2 {
	public static void main(String[] args) throws Exception {
		findClass();	//여기에 문제가 생기면 내가 지정한 Exception에 (throws)던져라.
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}

//4번 줄의 Exception 타입이 8번의 Exception 타입보다 큰 범위어야 한다.
//Exception > ClassNotFoundException이기 때문에 지금은 OK
//Throwable > Exception > ClassNotFoundException, ....
//Exception = 일반 예외, Error = 실행 예외