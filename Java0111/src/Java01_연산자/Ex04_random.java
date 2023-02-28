package Java01_연산자;
//import java.lang.*; -> java.lang에 있는 String, Math 등 모든 클래스들은 자동으로 들어가 있다.

public class Ex04_random
{ 

	public static void main(String[] args)
	{
		//1번일 경우: 1출력, 2번일 경우: 2출력, 6번일 경우: 6출력
		int num = (int)(Math.random() * 6) + 1;	//random() : 0~1 숫자를 무작위로 생성
		//Math.random() 함수는 0 이상 1 미만 => 0.xxx..로 만들 수 있는 수를 랜덤(난수) 생성
		//생성한 값에 범위의 최댓값을 곱해주어 랜덤 추출 사용한다.
		
		if(num == 1) System.out.println("1");
		else if(num == 2) System.out.println("2");
		else if(num == 6) System.out.println("6");
		else System.out.println("1, 2, 6이 아닙니다.");
		
		//랜덤난수를 이용하여 인증번호를 생성하기도 하고 배열에서 랜덤값을 꺼낼 때 사용, 암호번호 생성.. 다양하게 활용!
		int rannum1 = (int)(Math.random() * 10);  //0~10의 범위 중 랜덤으로 1개
		int rannum2 = (int)(Math.random() * 899) + 100;  //100~999의 범위 중 랜덤으로 1개
		//int(실수)는 버림이다.
		

	}

}
