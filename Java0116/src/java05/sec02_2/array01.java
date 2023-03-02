package java05.sec02_2;

public class array01
{

	public static void main(String[] args)
	{
		// 1. 4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여
		// 정수 16개를 배열에 지정하고, 2차원 배열을 출력하여라.
		int[][] arr_2 = new int[4][4];
		for(int i = 0; i < arr_2.length; i++) {
			for(int j = 0; j < arr_2[i].length; j++) {
				arr_2[i][j] = (int)(Math.random() * 10) + 1;
				System.out.printf("%3d ", arr_2[i][j]);
			}
			System.out.println();
		}
		
	}

}
