package Java01_탐색.sec04_깊이우선탐색DFS;

//미완
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class IceExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//가로 길이
		int M = sc.nextInt();	//세로 길이
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		boolean[][] visited = new boolean[N][M];
		
		IceExample dfsIce = new IceExample();
		dfsIce.dfs(arr, 0, 0, visited);
	}
	
	void dfs(int[][] arr, int start_x, int start_y, boolean[][] visited) {
		visited[start_x][start_y] = true;
		
		if(start_y < arr[start_x].length - 1 && !visited[start_x][start_y + 1] &&  arr[start_x][start_y + 1] == 0) {
			dfs(arr, start_x, start_y + 1, visited);
			System.out.println("start_x : " + start_x + ", start_y : " + start_y); //확인용
		}
		else if(start_x < arr.length - 1 && !visited[start_x + 1][start_y] &&  arr[start_x + 1][start_y] == 0) {
			dfs(arr, start_x + 1, start_y, visited);
			System.out.println("start_x : " + start_x + ", start_y : " + start_y); //확인용
		}
		else {
			System.out.println("else");
		}
	}
}
