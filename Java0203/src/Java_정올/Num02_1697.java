package Java_정올;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num02_1697
{
	public static void main(String[] args)
	{
		Queue<Integer> que = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//주어지는 명령의 수
		sc.nextLine();
		
		String[] arr = new String[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < arr.length; i++) {
			switch(arr[i].charAt(0)) {
			case 'i':	//자연수 입력 -> add 또는 offer
				que.add(Integer.parseInt(arr[i].split(" ")[1]));
				//que.offer(Integer.parseInt(arr[i].split(" ")[1]));
				break;
			case 'c' :	//큐에 있는 데이터의 수 출력
				System.out.println(que.size());
				break;
			case 'o' :	//큐에서 데이터 빼고 출력 -> remove 또는 poll
				if(que.isEmpty()) {
					System.out.println("empty");
				}
				else {
					System.out.println(que.remove());
					//System.out.println(que.poll());
				}
				break;
			}
		}
	}
}
