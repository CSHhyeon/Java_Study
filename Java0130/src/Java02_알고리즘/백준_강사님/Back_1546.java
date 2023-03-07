package Java02_알고리즘.백준_강사님;

import java.util.Scanner;

public class Back_1546
{
	public static void main(String[] args)
	{
		//1. 변수 N에 과목의 수 입력받기
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		//2. 길이가 N인 1차원 배열 scores[] 선언
		int[] scores = new int[N];
		
		//3. for(scores 길이만큼 반복){scores 점수 저장}
		for(int i = 0; i < N; i++) {
			scores[i] = in.nextInt();
		}
		
		//4. for(scores 길이만큼 반복){scores의 최고점 max 저장, 총점 total 저장}
		//코딩 테스트 유의점! int로 하지 말고 long으로 선언하는 것을 추천한다. 범위를 넘어갈 수 있다. (숫자 계산해서 저장할 떄)
		long total = 0;
		long max = 0;
		for(int i = 0; i < N; i++) {	
			if(scores[i]> max) {
				max = scores[i];
			}
			total += scores[i];
		}
		
		//5. 평균 출력(수식 적용) total*100/max/N
		System.out.println(total * 100.0 / max / N);
	}
}
