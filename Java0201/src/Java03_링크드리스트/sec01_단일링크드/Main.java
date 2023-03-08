package Java03_링크드리스트.sec01_단일링크드;

public class Main
{
	public static void main(String[] args)
	{
		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(2);
		
		node1.next = node2;
		Node<Integer> head = node1;
		
		//------------------------------------------------------------------------
		SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
		MyLinkedList.addNode(1);
		System.out.println(MyLinkedList.head.data);			//1
		
		MyLinkedList.addNode(2);
		System.out.println(MyLinkedList.head.data);			//1
		System.out.println(MyLinkedList.head.next.data);	//2
		
		//------------------------------------------------------------------------
		SingleLinkedList<Integer> MyLinked = new SingleLinkedList<Integer>();
		MyLinked.addNode(1);
		MyLinked.addNode(2);
		MyLinked.addNode(3);
		MyLinked.printAll();	//1 2 3
	}
}
