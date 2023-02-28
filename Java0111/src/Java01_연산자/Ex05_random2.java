package Java01_연산자;

public class Ex05_random2
{

	public static void main(String[] args)
	{
		//Math.random()이 제공하는 숫자들 확인 0.1~1에 무한히 가까운 수를 제공
		for(int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		
		/*
		  Math.random()메소드를 이용하여 원하는 (정수) 범위까지 만들기
		  Math.random() * 숫자 : 입력한 숫자보다 무한히 가까운 수를 만들 수 있다.
		  ex) 8.9 * 12 = 10.8   -> 10을 원함 -> int로 강제 캐스팅
		  	  0.99 * 12 = 11.88 -> 11을 원함
		  	  (int)Math.random() * (최대값-최소값+1) + 최소값 -> 공식 꼭 암기할 것!! 매우 중요!
		  	  
		  1~12까지의 랜덤 숫자 10개의 숫자를 출력
		  int num = ((int)(Math.random() * 12) + 1);	//12-1+1 = 12
		*/
		int num = ((int)(Math.random() * 12) + 1);
		System.out.println(num);
		
		//퀴즈 : 12부터 24까지의 랜덤 숫자 10가지를 출력
		for(int i = 0; i < 10; i++) {
			int ran = ((int)(Math.random() * 13) + 12); //24-12+1=13
			System.out.println(ran);
		}
		
	}
}
