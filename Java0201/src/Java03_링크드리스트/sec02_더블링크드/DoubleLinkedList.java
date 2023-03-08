package Java03_링크드리스트.sec02_더블링크드;

import Java03_링크드리스트.sec01_단일링크드.Node;

public class DoubleLinkedList<T>
{
	public Node<T> head = null;
	public Node<T> tail = null;
	
	public class Node<T>{
		T data;
		Node<T> prev = null;				//이전 노드 객체를 가리키는 레퍼런스 변수
		Node<T> next = null;				//다음 노드 객체를 가리키는 레퍼런스 변수
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	public void addNode(T data) {
		if (this.head == null) {			//현재 시작점이 null이라면 아직 리스트가 없다는 것
            this.head = new Node<T>(data);	//즉, 내가 넣고 싶은 새로운 데이터를 시작점으로 만들어준다.
            this.tail = this.head;			//하나 밖에 없으니 끝 부분인 tail에도 시작점인 head가 들어간다.
        }
		else {								//null이 아니라면 현재 더블링크드리스트가 있다는 것
            Node<T> node = this.head;		//node라는 변수를 선언해 여기에 현재 시작점인 head값을 넣는다.(초기화)
            while (node.next != null) {		//리스트가 끝날 때까지(끝까지)
                node = node.next;			//노드를 다음 노드로 옮긴다.
            }		
            								//while문을 나왔으니 현재 노드는 가장 마지막 노드이다.
            node.next = new Node<T>(data);	//가장 마지막 노드의 다음에 새로운 데이터를 넣는다.
            node.next.prev = node;			//새로 만든 노드의 이전에 현재 노드를 넣어 두 개를 연결한다.
            this.tail = node.next;			//가장 마지막에 새로운 친구가 생겼으니 tail에 새로 생긴 노드를 넣어준다.
        }
	}
	
	 public void printAll() {
	     if (this.head != null) {			//head가 null이 아니라면 == 링크드리스트가 있다면
	         Node<T> node = this.head;		//node 변수를 선언에 현재 시작점으로 초기화해준다.
	         System.out.println(node.data);	//현재 데이터를 출력한다. -> 시작점의 데이터를 출력하는 것
	         while (node.next != null) {	//다음 노드가 없을 때까지(끝까지)
	             node = node.next;			//다음 노드로 간다.
	             System.out.println(node.data);	//해당 노드를 출력한다. -> 노드를 하나씩 옮기며 다 출력시킬 수 있다.
	         }
	     }
	 }
	 
	 public Node<T> search(T data){
		 if(this.head == null) {
			 return null;
		 }
		 else {
			 Node<T> node = this.head;
			 while(node != null) {
				 if(node.data == data) {
					 return node;
				 }
				 else {
					 node = node.next; 
				 }
			 }
			 return null;
		 }
	 }
	 
	 public T searchFromHead(T isData) {
		 if(this.head == null) {
			 return null;
		 }
		 else {
			 Node<T> node = this.head;
			 while(node != null) {
				 if(node.data == isData) {
					 return node.data;
				 }
				 else {
					 node = node.next;
				 }
			 }
			 return null;
		 }
	 }
	 
	 public T searchFromTail(T isData) {
		 if(this.head == null) {
			 return null;
		 }
		 else {
			 Node<T> node = this.tail;
			 while(node != null) {
				 if(node.data == isData) {
					 return node.data;
				 }
				 else {
					 node = node.prev;
				 }
			 }
			 return null;
		 }
	 }
	 
	 public boolean insertToFront(T existedData, T addData) {
	        if (this.head == null) {
	            this.head = new Node<T>(addData);
	            this.tail = this.head;
	            return true;
	        } else if (this.head.data == existedData) {
	            Node<T> newHead = new Node<T>(addData);
	            newHead.next = this.head;
	            this.head = newHead;
	            this.head.next.prev = this.head;          
	            return true;
	        } else {
	            Node<T> node = this.head;
	            while (node != null) {
	                if (node.data == existedData) {
	                    Node<T> nodePrev = node.prev;
	                    
	                    nodePrev.next = new Node<T>(addData);
	                    nodePrev.next.next = node;
	                    
	                    nodePrev.next.prev = nodePrev;
	                    node.prev = nodePrev.next;
	                    return true;
	                } else {
	                    node = node.next;
	                }
	            }
	            return false;
	        }
	    }
}
