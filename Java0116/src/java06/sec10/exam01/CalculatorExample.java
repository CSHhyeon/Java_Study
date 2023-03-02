package java06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		//Calculator는 Static으로 선언되어 굳이 new로 인스턴스화하지 않고 .pi로 직접 접근이 가능하다. 
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}