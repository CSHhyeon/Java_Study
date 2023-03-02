package Java01_아침문제.sec01;

public class Rectangle
{
	private int width;
	private int height;
	private int area;
	private String color;
	
	Rectangle(){
		this.color = "청색";
		this.width = 20;
		this.height = 10;
	}
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		this.color = "흰색";
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setColor(String color) {
		if(color.equals("")) this.color = "녹색";
		else this.color = color;
	}
	
	private int calculateArea_intern() {
		this.area = this.getWidth() * this.getHeight();
		return this.area;
	}
	
	public void calculateArea(){	//메인 함수에 private인 함수 이름이 유출되는 것을 막기 위해!
		int area = calculateArea_intern();
		System.out.println( this.color + " 직사각형 면적 : " + area);
	}
}
