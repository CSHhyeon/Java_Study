package Java_정올;
//7. 자료처리 1697

import java.util.ArrayList;
import java.util.Scanner;

public class Num01_1697<T>
{
	private ArrayList<Integer> queue = new ArrayList<Integer>();
	
	public void enque(int n) {
		queue.add(n);
	}
	
	public void deque() {
		if(queue.size() == 0) {
			System.out.println("empty");}
		else {
			System.out.println(queue.remove(0));
		}
	}
	
	public void print() {
		System.out.println(queue.size());
	}
	
	public static void main(String[] args)
	{
		Num01_1697<Integer> que = new Num01_1697<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//주어지는 명령어의 수
		sc.nextLine();
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < N; i++) {
			switch(arr[i].charAt(0)) {
			case 'i' :
				que.enque(Integer.parseInt(arr[i].split(" ")[1]));
				break;
			case 'o' :
				que.deque();
				break;
			case 'c' :
				que.print();
				break;
			}
		}
	}
}
