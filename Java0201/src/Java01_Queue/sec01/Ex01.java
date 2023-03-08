package Java01_Queue.sec01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex01
{
	public static void main(String[] args)
	{
		//큐를 사용하려면 'ArrayList'를 사용해야 한다. -> 순서가 중요하기 때문이다!
		//본문에 LinkedList 적혀있는 것은 오타이다. LinkedList가 아니라 ArrayList를 사용해야 한다.
		Queue<Integer> queue_int = new LinkedList<Integer>();	//Int형 큐
		Queue<String> queue_str = new LinkedList<String>();		//String형 큐
		
		queue_int.add(1);
		queue_int.offer(2);
		
		System.out.println(queue_int); 	//[1, 2]
		queue_int.poll();	//첫 번째 값을 반환 후 해당 값을 큐에서 삭제
		System.out.println(queue_int);	//[2]
		queue_int.remove();	//poll과 마찬가지로 첫 번째 값을 반환 후 해당 값을 큐에서 삭제
		System.out.println(queue_int);	//[]

	}
}
