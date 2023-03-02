package Java02.sec02;

public abstract class Content
{
	private String title;
	private int price;
	
	Content(String title){
		this.title = title;
	}
	
	public abstract void totalPrice();
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void show() {
		System.out.println(this.getTitle() + " 비디오의 가격은 " + this.getPrice() + "원 입니다.");
	}
}
