package Java01_아침문제.sec01;

public class Prob1 {
	
	public static void main(String[] args){
		
		Rectangle rectangle01 = new Rectangle();
		System.out.printf("1 : ");
		rectangle01.calculateArea();
		 
		Rectangle rectangle02 = new Rectangle(20, 20);
		System.out.printf("2 : ");
		rectangle02.calculateArea();
		 
		Rectangle rectangle03 = new Rectangle();
		rectangle03.setHeight(10);
		rectangle03.setWidth(10);
		rectangle03.setColor("");
		System.out.printf("3 : ");
		rectangle03.calculateArea();
	
	}
	
}
