package Java01_재귀.sec02;

public class Ex01_Numprint
{
	public static void f1(int n) {
		if(n == 0) return;
		System.out.println(n);
		f1(n-1);
	}
	
	public static void main(String[] args)
	{
		f1(5);
	}
}

/* 호출 순서 : 5 -> 4 -> 3 -> 2 -> 1
 * f1(5)이므로 함수 안으로 들어가 5를 출력하고 f1(4)가 실행된다.
 * 그러면 다시 자기 안으로 들어가 4가 출력되고 f1(3)이 된다.
 * 이렇게 반복하다가 f1(0)이 되면 다시 함수로 들어가 if문을 수행하고 종료된다.
 * */
