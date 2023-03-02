package Java02.sec02;

public class Video extends Content
{
	private String genre;
	
	Video(String title, String genre)
	{
		super(title);
		this.genre = genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	@Override
	public void totalPrice()
	{
		if(this.getGenre().equals("new")) this.setPrice(2000);
		else if(this.getGenre().equals("comic")) this.setPrice(1500);
		else if(this.getGenre().equals("child")) this.setPrice(1000);
		else this.setPrice(500);
		
	}
}
