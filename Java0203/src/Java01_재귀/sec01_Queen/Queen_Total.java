package Java01_재귀.sec01_Queen;

public class Queen_Total
{
	static boolean[] flag = new boolean[8];		//각 행에 퀸이 이미 배치되어있는가?
	static boolean[] flag_a = new boolean[15];	// / 대각선에 이미 배치되어있는가?
	static boolean[] flag_b = new boolean[15];	// \ 대각선에 이미 배치되어있는가?
	static int[] pos = new int[8];				//각 열의 퀸의 위치
		
	//--- i열의 알맞은 위치에 퀸을 배치 ---//
	static void set(int i) {
		for(int j = 0; j < 8; j++) {
			if(flag[j] == false && flag_a[i + j] == false && flag_b[i - j + 7] == false) {
				pos[i] = j;		//퀸을 j행에 배치
				if(i == 7) {
					print();	//모든 열에 배치 완료하면 출력
				}
				else {
					flag[j] = flag_a[i + j] = flag_b[i - j + 7] = true;
					set(i + 1);
					flag[j] = flag_a[i + j] = flag_b[i - j + 7] = false;
				}
			}
		}
	}
		
	//--- 각 열의 퀸 위치를 출력 ---//
	static void print() {
		for(int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
		
	public static void main(String[] args)
	{
		set(0);
	}
}
