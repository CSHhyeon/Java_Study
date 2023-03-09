package Java_정올;

import java.util.Scanner;
import java.util.Stack;

public class Num01_1102
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//주어지는 명령의 수
		sc.nextLine();
		
		String[] arr = new String[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < arr.length; i++) {
			switch(arr[i].charAt(0)) {
			case 'i' :	//스택에 값 넣기.
				stack.push(Integer.parseInt(arr[i].split(" ")[1]));
				break;
			case 'c' :	//스택에 쌓여있는 데이터의 수 출력
				System.out.println(stack.size());
				break;
			case 'o' :	//스택에서 데이터를 빼고, 그 데이터를 출력. 만약 스택이 비어있으면 "empty" 출력
				if(stack.size() == 0) {
					System.out.println("empty");
				}
				else {
					System.out.println(stack.pop());
				}
				break;
			}
		}
	}
}
