package Java03_배열;

public class Ex5_이차원배열
{

	public static void main(String[] args)
	{
		int sum = 0;
		int[][] score = {
				{100, 100, 100},	
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
		};
		
		//score.length는 row의 대표값이다. 즉, 4행 3열이니 현재 score.length = 4가 나온다.
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.printf("sum = %d%n", sum);
		
		sum = 0;
		for(int[] tmp:score) {
			for(int i:tmp) {
				sum += i;
			}
		}
		System.out.println("총합 : " + sum);

	}

}
