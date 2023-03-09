package Java_정올;

import java.util.Scanner;

public class Num06_1221
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//입력할 수
		char[] calc = new char[N];
		
		String input = sc.nextLine();
		char[] in = input.toCharArray();
		int x = 0, y = 0;
		int result = 0;
		
		//다시 처음부터하기! stack같은거 사용하면 좋을 듯
		for(int i = 0; i <= in.length / 2; i++) {
			int index = i * 2;
			if(i != 0 && index % 4 ==0) { //부호 들어가는 부분
				if(index == 4) {
					
				}
			}
		}
	}
}
