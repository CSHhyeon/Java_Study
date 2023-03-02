package java05.sec02_2;

public class array02
{

	public static void main(String[] args)
	{
		// 4x4의 2차원 배열을 만들고 이곳에 1~10까지의 범위의 정수를 랜덤하게 생성하여 임의의 위치에 삽입하여라.
		// 동일한 정수가 있어도 상관없다. 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 출력하라.
		int[][] arr = new int[4][4];
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < 10; i++) {
			a = (int)(Math.random() * 4);
			b = (int)(Math.random() * 4);
			if(arr[a][b] == 0) {
				arr[a][b] = (int)(Math.random() * 10) + 1;
			}
			else i--;
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}

}
