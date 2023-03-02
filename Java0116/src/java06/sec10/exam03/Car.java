package java06.sec10.exam03;

public class Car {
	//인스턴스 필드 선언
	int speed;

	//인스턴스 메소드 선언
	void run() {
		//this.speed = 30; -> 여기서는 사용이 가능! 
		System.out.println(speed + "으로 달립니다.");
	}

	static void simulate() {
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
		//this.speed = 30; //this 사용하지 못함.(static이라서 메모리 영역이 다르기 때문)
	}

	public static void main(String[] args) {
		//정적 메소드 호출
		simulate();
		
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}