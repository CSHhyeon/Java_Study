package Java02_Stack.sec02;

public class IntStack
{
	private int[] stk;	//스택용 배열
	private int capacity;
	private int ptr;	//스택 포인터
	
	//--- 생성자(constructor) ---//
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		}
		catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	//--- 실행시 예외 : 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//--- 실행시 예외 : 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//--- 스택에 값을 입력(푸시) --- ptr ===> 포인터 데이터의 위치를 신경써야 한다.//
	public int push(int x) throws OverflowIntStackException{	
		if(ptr >= capacity) throw new OverflowIntStackException();  //스택 오버플로우(꽉 참)
		return stk[ptr++] = x;
	}
	
	//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) throw new EmptyIntStackException();	//꺼낼게 있는지 체크
		return stk[--ptr];
	}
	
	//--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public int peak() throws EmptyIntStackException{	//스택이 빔
		if(ptr <= 0) throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	//--- 스택을 비움 ---//
	public void clear() {
		ptr = 0;
	}
	
	//--- 스택에서 X를 찾아 인덱스(없으면 -1)를 반환 ---//
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {		//꼭대기 쪽부터 선형 검색
			if(stk[i] == x) return i;
		}
		return -1;
	}
	
	//--- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}
	
	//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return ptr >= capacity;
	}
	//--- 스택 안의 모든 데이터를 바닥 -> 정상 순서로 표시 ---//
	public void dump() {
		if(ptr <= 0) System.out.println("스택이 비어있습니다.");
		else {
			for(int i = 0; i < ptr; i++) System.out.println(stk[i] + " ");
			System.out.println();
		}
	}
}
