package Java_정올;

import java.util.ArrayList;
import java.util.Scanner;

public class Num02_1102<T>
{
	private ArrayList<T> stack = new ArrayList<T>();
	
	//스택에 값 넣기
	public void push(T n) {
		stack.add(n);
	}
	
	//스택에서 값 빼기
	public void pop() {
		if(stack.size() == 0) System.out.println("empty");
		else {
			System.out.println(stack.remove(stack.size() - 1));
		}
	}
	
	//스택에 쌓여있는 데이터의 수 출력
	public void print() {
		System.out.println(stack.size());
	}
	
	public static void main(String[] args)
	{
		Num02_1102<Integer> stk = new Num02_1102<Integer>();
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//주어지는 명령의 수
		sc.nextLine();			//버퍼 비워주기
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < arr.length; i++) {
			switch(arr[i].charAt(0)) {
			case 'i' :
				stk.push(Integer.parseInt(arr[i].split(" ")[1]));
				break;
			case 'c' :	//데이터 수 출력
				stk.print();
				break;
			case 'o' :	//데이터 빼기
				stk.pop();
				break;
			}
		}
	}
}
