package Java03_컬렉션.sec01.List02;

public class Board	//BAO : 데이터만 저장하는 용도.
{
	private String subject;
	private String content;
	private String writer;
	
	public Board(String b, String c, String w) {
		this.subject = b;
		this.content = c;
		this.writer = w;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getWriter()
	{
		return writer;
	}

	public void setWriter(String writer)
	{
		this.writer = writer;
	}
	
}
