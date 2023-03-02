package java05.sec02_1;

public class Ex01_삼차원배열
{

	public static void main(String[] args)
	{
		// 2차원 : 행, 열
		// 3차원 : 면, 행, 열
		int arr[][][] =  new int[3][3][3];
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("%d ", num);
					num++;
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
