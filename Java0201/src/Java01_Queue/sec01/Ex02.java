package Java01_Queue.sec01;

import java.util.ArrayList;

public class Ex02<T>
{
	private ArrayList<T> queue = new ArrayList<T>(); 
	
	//enqueue 기능 두 가지 : add, offer
	public void enqueue(T item) {
		queue.add(item);
	}
	
	//dequeue 기능 두 가지 : poll, remove
	public T dequeue() {
		if(queue.isEmpty()) {
			return null;
		}
		return queue.remove(0);
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public static void main(String[] args)
	{
		Ex02<Integer> mq = new Ex02<Integer>();
		mq.enqueue(1);
		mq.enqueue(2);
		mq.enqueue(3);
		System.out.println(mq.dequeue());	//1
		System.out.println(mq.dequeue());	//2
		System.out.println(mq.dequeue());	//3
	}
}
