package Java01_Test.WithTeacher;

import java.util.Scanner;

public class Main09
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		char[][] result = new char[N][N];
		
		//1. char 2차원 배열의 기본값은 없으므로, 공백을 세팅해주어야 한다. -> 배점있음
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				result[i][j] = ' ';
			}
		}
		
		//char에서 A(65) ~ Z(90)
		int text = 65;
		int temp = 0;
		
		//문자값을 위치에 넣기. 규칙을 찾아야 한다.
		for(int row = 0; row < N; row++) {
			for(int i = 0; row + i < N; i++) {
				result[row + i][N - 1 - i] = (char)(text + temp % 26);
				temp++;
			}
		}
		
		//공백 넣기.(공백 넣기 규칙)
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.println(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
