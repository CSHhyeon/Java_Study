package Java01_재귀.sec01_Queen;

public class QueenBranch
{
	//각 행에 퀸이 이미 배치되었는지 체크
	static boolean[] flag = new boolean[8];
	//퀸의 위치 배열
	static int[] pos = new int[8];
	
	//퀸을 배치하는 기능 set() pos[i열] = j행
	static void set(int i) {
		for(int j = 0; j < 8; j++) {
			if(flag[j] == false) {
				pos[i] = j;	//퀸을 j행에 배치
				if(i == 7) {
					print();
				}
				else {
					flag[j] = true;
					set(i + 1);	//열을 바꿔줌. -> 재귀! 다음 열에 대한 세팅을 한다.
					flag[j] = false;
				}
			}
		}
	}
	
	//각 열의 퀸의 위치를 출력 print()
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
