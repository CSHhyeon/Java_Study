package Java02_알고리즘.sec01_시간복잡도;

public class timecomplexity
{

	public static void main(String[] args)
	{
		// 0~99까지의 무작위값을 찾아 출력하는 코드
		int findNumber = (int)(Math.random() * 100);
		for(int i = 0; i < 100; i++) {
			if(i == findNumber) {
				System.out.println(i);
				break;
			}
		}
		
		/* 위 상황에서 시간 복잡도
		 * 빅 오메가(n) = 1번	-> best case : 한 번에 성공
		 * 빅 세타(n) = N/2번
		 * 빅 오(n) = N번		-> worst case : 모든 경우의 수를 다 체크하고 가장 마지막에 성공
		 * 
		 * 우리는 항상 빅오 계산법으로 수행 시간을 계산하는 것이 좋다.
		 * 가장 최악의 경우를 생각하고 알고리즘을 짜야 한다.
		 * */
	}

}
