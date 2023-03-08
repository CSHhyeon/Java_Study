package Java03_링크드리스트.sec01_단일링크드;

public class SingleLinkedList<T>
{
	public Node<T> head = null;
	
	/*
	//여기에 public class Node만들어도 된다.
	public class Node<T>
	{
		T data;
		Node<T> next = null;
		
		public Node(T data) {
			this.data = data;
		}
	}
	*/
	
	public void addNode(T data) {
		if(head == null) {					//시작점인 head가 null이라면
			head = new Node<T>(data);		//지금 데이터값을 head에 넣어 링크드리스트의 시작을 열어준다. 첫 번째 값이 된다.
		}
		else {								//null이 아니라면 이미 링크드리스트가 있는 것
			Node<T> node = this.head;		//node라고 새로 선언한 변수에 현재 시작점인 head를 넣어준다.
			while(node.next != null) {		//다음 노드가 없을 때까지
				node = node.next;			//노드 변수에 다음 노드를 넣어준다.
			}
			node.next = new Node<T>(data);	//마지막 부분까지 왔으니 가장 마지막 부분에 새로운 데이터를 넣어준다.
		}
	}
	
	//1번째로 추가된 내용
	public void printAll() {
		if(head != null) {
			Node<T> node = this.head;		//node 변수에 현재 시작점인 head를 넣어준다.
			System.out.println(node.data);	//현재 데이터값을 출력(시작점인 head의 데이터)
			while(node.next != null) {		//다음 노드가 없을때까지
				node = node.next;			//node 변수에 다음 노드를 넣어준다.(첫 번째 노드는 이미 출력했으니)
				System.out.println(node.data);	//해당 노드의 값을 출력한다.
			}
		}
	}
	
	//2번째로 추가된 내용 -> 선형 검색(앞에서부터 차근차근..)
	public Node<T> search(T data){			//비어있는 노드를 찾는 것(자신이 들어갈 노드 클래스의 위치)
		if(this.head == null) {				//head : 첫 번째 노드
			return null;					//head없으면 비어있다는 의미이니 null 출력
		}
		else {								//head가 null이 아니면 어떠한 값이 있다는 것
			Node<T> node = this.head;		//node에 현재 head를 넣는다.(초기화)
			while(node != null) {			//head부터 차근차근 끝까지 검색하는 과정
				if(node.data == data) {		//내가 원하는 데이터를 가지고 있는 노드를 찾았다면
					return node;			//해당 노드를 반환
				}
				else {
					node = node.next;		//만약 내가 원하는 데이터를 찾지 못했다면 다음 노드를 확인
				}
			}
			return null;
		}
	}
	
	public void addNodeInside(T data, T isData) {	//Data : 내가 넣고 싶은 데이터, isData : 현재 인덱스를 쓰고 있지 않기 때문에 내가 넣고 싶은 데이터의 바로 앞 노드
		Node<T> searchedNode = this.search(isData);	//중간에 넣을 것을 찾는 것. 시작 부분을 찾아준다.
		
		if(searchedNode == null) {					//데이터 값을 가지고 있는 데이터가 없다면
			this.addNode(data);	//null이니 바로 넣으면 된다.
		}
		else {	//데이터가 있다는 것
			Node<T> nextNode = searchedNode.next;	//searchedNode : 내가 넣고 싶은 데이터 바로 앞 주소! .next -> 다음으로 포인터.. 내가 넣고 싶은 부분
			searchedNode.next = new Node<T>(data);	//searchedNode.next를 하면 내가 넣고 싶은 노드 다음이므로 포인터 부분이 된다.
			searchedNode.next.next = nextNode;		//.next.next를 하면 포인터 다음으로 나오는 노드가 나온다.
		}
		/* 그림에서 설명하자면 searchedNode는 "node" 즉, 12의 값, searchedNode.next는 "newnode" 즉, 37의 값
		 * searchedNode.next.next는 "node.next" 즉, 99가 된다.
		 * nextNode라는 새로운 변수를 만들어주고 얘는 searchedNode.next가 된다. 12를 찾았고, 걔 바로 다음이 99였으니까!
		 * searchedNode.next에 내가 새로 넣고 싶은 데이터 값을 넣어준다. 그림으로 보면 37이 된다.
		 * 그럼 99는 쫓겨났는데 searchedNode.next.next에 이 nextNode인 99을 넣어준다.
		 * 그러면 12 -> 99였던 구조가 12 -> 37 -> 99인 구조가 된다. 12 다음에는 37, 12 다음다음에는 99가 들어가게 했기 때문!
		 * */
	}
	
	public boolean delNode(T isData) {
		if(this.head == null) {
			return false;
		}
		else {
			Node<T> node = this.head;
			if(node.data == isData) {		//노드가 하나만 있다면
				this.head = this.head.next;	//시작점인 본인만 있었으니 다음 지점을 시작점으로 바꿔 해당 노드를 투명인간 취급한다.
				return true;
			}
			else {							//노드가 여러 개 있다면
				while(node.next != null) {
					if(node.next.data == isData) {		//다음 노드의 데이터가 내가 삭제하고자 하는 값이라면
						node.next = node.next.next;		//다음 노드의 데이터를 다다음 데이터로 수정해 삭제하고자 하는 값을 무시한다.
						return true;
						//node.next = node.next.next는 그림으로 보자면 12 -> 37(next) -> 99(next next)인데
						//12 -> 99 (next 자리에 next next  넣기)가 된다. 37은 무리애서 튕겨져나가 투명인간이 된다.
					}
					node = node.next;	//끝까지 확인해야 하니 
				}
				return false;
			}
		}
	}
}
