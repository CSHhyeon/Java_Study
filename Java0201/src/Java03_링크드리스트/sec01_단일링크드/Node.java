package Java03_링크드리스트.sec01_단일링크드;

public class Node<T>
{
	T data;
	Node<T> next = null;
	
	public Node(T data) {
		this.data = data;
	}
}
