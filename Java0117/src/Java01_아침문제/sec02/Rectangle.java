package Java01_아침문제.sec02;

public class Rectangle
{
	private int width;
	private int length;
	private String color;
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setColor(String color) {
		if(color.equals("")) this.color = "녹색";
		else this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int area(){
		return this.length * this.width;
	}
	
	public int perimeter() {
		return 2 * (this.length + this.width);
	}
}
