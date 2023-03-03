package Java02.base.Wrapper;

import java.util.Scanner;

public class Ex01_값처리
{

	public static void main(String[] args)
	{
		Integer num1 = Integer.valueOf(20);  //java5부터의 문법
		System.out.println(num1.intValue());
		
		Double d1 = Double.valueOf(3.14);
		System.out.println(d1.doubleValue());
		
		Scanner sc = new Scanner(System.in);
		Integer num2 = Integer.valueOf(sc.nextInt());	//객체로 처리하는 것
		System.out.println(num2.intValue());
		
		int n = 10;
		Integer n1 = Integer.valueOf(n);  //'박싱'해서 객체로 만든다. -> 값을 객체로 생성(boxing)
		System.out.println(n1.toString());
		int n2 = n1.intValue();	//'언박싱' 했다. -> 값으로 복구(unboxing)
		System.out.println(n2); //값이라서 n2.이 불가능!
		
		Integer iObj = 10;	//autoboxing
		Double dObj = 20.1;
		
		int n4 = iObj;	//autounboxing
		double d4 = dObj;
		
		System.out.println(n4 + " " + d4);
		
		Integer n5 = 10;	//autoboxing
		n5++;	//Integer.valueOf(n5.intValue() + 1) -> 내부적으로 일어나는 일! 오토박싱과 오토언박싱이 동시에 처리됨.
		        //즉, 래퍼클래스도 증감/감소 연산자 사용이 가능하다.
		System.out.println(n5.intValue());
		
		n5 += 3;  //Integer.valueof(n5.intValue() += 3)
		System.out.println(n5.intValue());
	}
}

/* Wrapper 클래스 : 자바의 8개의 기본데이터형(정수형, 문자형, 논리형, ..)에 대응하는 클래스
 * 기본객체형을 객체로써 인식할 수 있도록 하기 위해 만든 클래스 
 * boolean => Boolean
 * byte => Byte
 * char => Character
 * short => Short
 * int => Integer
 * long => Long
 * float => Float
 * double => Double
 * 
 * 사용용도 : 값 변환, 형 변환, 진법 변환
 * (MIN_VALUE, MAX_VALUE)
 * 메서드 매개변수의 형이 Object여서 기본 자료형을 사용 못하고 Wrapper 클래스로 넘겨서 사용해야 한다. (컬렉션 프레임워크)
 * 
 * 추가된 클래스
 * - Number 클래스 : java.lang.Number 모든 수치형 래퍼 클래스가 상속하는 추상클래스. 
 * */
