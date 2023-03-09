package Java_정올;

import java.util.Scanner;

public class Num05_1370
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//회의의 수
		int[][] arr = new int[N][];
		
		for(int i = 0; i < N; i++) {
			String str = sc.nextLine();
			arr[i][0] = Integer.parseInt(str.split(" ")[0]);	//회의 번호
			arr[i][1] = Integer.parseInt(str.split(" ")[1]);	//시작 시간
			arr[i][2] = Integer.parseInt(str.split(" ")[2]);	//종료 시간
			arr[i][3] = arr[i][2] - arr[i][1];	//총 회의 시간
		}
		
		//1. 최대한 많은 회의를 받으려면 회의 시간이 짧아야 한다. -> arr[i][3]
		//2. 처음 시작하는 회의는 이른 시간일 수록 좋다.
		

	}
}
