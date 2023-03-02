package java07.sec04.exam01;

public class Computer extends Calculator { //Calculator를 부모로 선택
	//메소드 오버라이딩
	@Override    //어노테이션 제공
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}