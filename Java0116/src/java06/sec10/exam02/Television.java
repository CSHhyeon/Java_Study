package java06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	//정적필드 static block
	static {
		info = company + "-" + model;
		//복잡한 초기화 작업이 있을 경우 정적 블럭을 사용하면 효과적이다.
		//클래스가 메모리로 로딩될 때 자동으로 실행된다.
		}
}