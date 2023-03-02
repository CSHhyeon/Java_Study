package java06.sec06.exam01;

//실행클래스
public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();

		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);  //String의 기본 초기값은 null
		System.out.println("시동여부: " + myCar.start); //boolean의 기본 초기값은 false
		System.out.println("현재속도: " + myCar.speed); //int의 기본 초기값은 0
	}
}