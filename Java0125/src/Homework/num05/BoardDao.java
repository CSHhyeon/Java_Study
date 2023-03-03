package Homework.num05;

import java.util.ArrayList;
import java.util.List;

public class BoardDao	//DAO(Data Access Object) : 데이터를 처리해주는 객체
{	
	public List<Board> getBoardList() {		//리턴타입으로 리스트형태를 주면 된다.
		List<Board> list = new ArrayList<>();	//글 목록들을 차례차례 저장하는 것이 좋으니 arraylist 사용
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}
	
	/* 강사님 버전
	public List<Board> getBoardList() {		//리턴타입으로 리스트형태를 주면 된다.
		List<Board> list = new ArrayList<>();	//글 목록들을 차례차례 저장하는 것이 좋으니 arraylist 사용
		for(int i = 0; i < 3; i++){
			Board board = new Board("제목" + (i + 1), "내용" + (i + 1));
			list.add(board);
		}
		return list;
	}
	*/
}
