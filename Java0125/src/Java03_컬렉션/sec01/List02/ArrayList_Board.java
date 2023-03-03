package Java03_컬렉션.sec01.List02;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Board
{
	public static void main(String[] args)
	{
		//list라는 글 저장구조 생성
		List<Board> list = new ArrayList();	//보드는 순서가 중요하니까 배열로!
		
		//객체 추가
		list.add(new Board("subject1", "content1", "writer1"));
		list.add(new Board("subject2", "content2", "writer2"));
		list.add(new Board("subject3", "content3", "writer3"));
		list.add(new Board("subject4", "content4", "writer4"));
		list.add(new Board("subject5", "content5", "writer5"));
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("total : " + size);
		System.out.println();
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.printf("%s ", board.getSubject());
		System.out.printf("%s ", board.getContent());
		System.out.println(board.getWriter());
		System.out.println();
		
		//모든 객체를 하나씩 가져오기
		for(int i = 0; i < list.size(); i++) {
			Board board1 = list.get(i);
			System.out.println(board1.getSubject() + " : " + board1.getContent() + " : " + board1.getWriter());
		}
		System.out.println();
		
		//삭제
		list.remove(0);
		
		for(Board b : list) {
			System.out.println(b.getSubject() + " : " + b.getContent() + " : " + b.getWriter());
		}
	}	
}
