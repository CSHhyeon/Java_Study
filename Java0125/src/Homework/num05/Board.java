package Homework.num05;

public class Board	//게시판에서 글 하나를 의미한다고 보면 된다.
{
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}	
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
}
