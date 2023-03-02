package java07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
		
		Calculator computer1 = new Computer();
		System.out.println(computer1.areaCircle(r));
		
	}
}

/* 메소드를 재정의하면 부모 메소드는 숨겨지고 자식 메소드만 사용되기 때문에
 * 비록 부모 메소드의 일부만 변경된다 하더라도 중복된 내용을 자식 메소드도 가지고 있어야 한다.
 * 
 * 상속 ==> 공동 작업을 처리하기 위한 기법[공동작업 처리 기법]
 */