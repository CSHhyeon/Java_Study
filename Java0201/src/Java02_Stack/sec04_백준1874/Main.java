package Java02_Stack.sec04_백준1874;
//백준 1874 -> 스택은 배열로 써도 무방하다.
import java.util.Scanner;
import java.util.Stack;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();	//첫 줄 n 수열의 개수
		int[] arr = new int[N];
		
		//배열에 수열(data) 입력받기
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		//push, pop 기능을 이용해 자연수 정렬! Stack, StringBuffer 이용하자.
		Stack<Integer> stack = new Stack<Integer>(); 
		StringBuffer bf = new StringBuffer();
		
		//오름차순 수
		int num = 1;
		boolean result = true;
		for(int i = 0; i < arr.length; i++) {
			int su = arr[i];
			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
					bf.append("+\n");	
				}
				stack.pop();
				bf.append("-\n");
			}
			else {
				int n = stack.pop();
				if(n > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					bf.append("-\n");
				}
			}
		}
		//출력
		System.out.println(bf);
	}
}

/* 문제 이해!
 * 스택에 수를 push할 때에는 반드시 오름차순으로만 push할 수 있다.
 * 예를 들어, 8을 push해야 한다면 앞의 1~7을 모두 push하고 8을 push할 수 있다.
 * 스택을 쌓다가 필요한 타이밍에 pop을 하게 되는데, 이 pop을 한 수들을 쭉 나열했을 때,
 * N줄에 걸쳐 입력한 수열과 같아야 한다.
 * 그래서 스택의 TOP이 내가 입력한 수와 같다면 그 때 스택의 TOP을 꺼내 수열을 만들어 준다.
 * */
 