package Java01_Queue.sec02_링버퍼;

public class IntQueue	//링버퍼를 만들어보자.
{
	private int[] que;		//큐의 배열 -> 인큐되는 데이터를 저장하기 위해 필요!
	private int capacity;	//큐의 크기 -> 큐의 최대 용량을 저장하는 필드, 요소의 최대값과 같다.
	private int front;		//맨 처음 요소 커서 -> 디큐되는 부분 : 맨 앞 요소
	private int rear;		//맨 끝 요소 커서 -> 인큐하는 데이터 가운데 맨 뒤에 넣은 요소 하나 뒤 인덱스 저장
	private int num;		//현재 데이터 개수 -> 현재 큐의 상태를 점검하기 위해 필요!(가득찼는지, 비어있는지)
	
	public IntQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		}
		catch(OutOfMemoryError e){
			capacity = 0;
		}
		catch(Exception e) {
			System.out.println("exception");
		}
	}
	
	//--- 큐에 데이터를 인큐 ---//
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {};
	}
	
	public int enqueue(int n) throws OverflowIntQueueException{
		if(num >= capacity) {	//1. 큐가 가득 찼을 경우
			throw new OverflowIntQueueException();
		}
		
		//2. 인큐 성공일 경우
		que[rear++] = n;
		num++;
		
		//3. rear가 capacity와 같은 경우 -> 자료가 하나도 없는 경우(비어있는 경우) : rear = 0으로 설정
		//rear가 capacity와 같아지는 것을 방지하기 위해 인큐 구현 rear값을 1 증가했을 때 큐의 최대용량과 같아질 경우
		if(rear == capacity) rear = 0;
		return n;
	}
	
	//--- 큐에 데이터를 디큐 ---//
	public class EmptyIntQueueException extends RuntimeException{
		EmptyIntQueueException(){}
	}
	
	public int dequeue() throws EmptyIntQueueException{
		//1. 큐가 비어있는 경우 -> 뽑아낼 수 없음
		if(num <= 0) throw new EmptyIntQueueException();
		
		//2. 큐에 자료가 있는 경우 -> 순차적으로 뽑아낼 수 있음
		int n = que[front++];
		num--;
		if(front == capacity) front = 0;
		return n;
	}
	
	//--- 큐를 비움 ---//
	public void clear() {
		num = front = rear = 0;
	}
	
	//--- 큐의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}
	
	//--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
	public int size() {
		return num;
	}
	
	//--- 큐가 비어있는가? ---//
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//--- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		return num >= capacity;
	}
	
	public void dump() {
		if(num <= 0) System.out.println("큐가 비어있습니다.");
		else {
			for(int i = 0; i < num; i++) System.out.print(que[(i + front) % capacity] + " ");
			System.out.println();
		}
	}
	
	/*
	public int indexOf(int x) {
		
	}
	*/
}
