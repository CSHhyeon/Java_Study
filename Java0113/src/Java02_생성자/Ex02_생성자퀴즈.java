package Java02_생성자;

import java.util.Scanner;

class Book{
	String title;
	int price;
	int num;
	
	Book(){}	//기본생성자 (default constructor(생성자)) -> 메서드이지만 반환형이 없는 형태
	Book(String title, int price, int num){ //오버로딩
		this.title = title;	//제목 초기화
		this.price = price; //가격 초기화
		this.num = num;     //수량 초기화
	}	
	
	void print() {
		System.out.println("제 목 : " + title);
		System.out.println("가 격 : " + price);
		System.out.println("수 량 : " + num);
		System.out.println("합계 금액 : " + price * num + "원");
		System.out.println();
	}
}

public class Ex02_생성자퀴즈
{

	public static void main(String[] args)
	{
		Book[] book = new Book[100];
		int i = 0;
		
		//퀴즈! 사용자가 선택한 책 제목과 금액, 수량을 받아서 정보를 출력하는 프로그램을 작성하세요.
		//조건 : exit가 입력될때까지 책의 정보를 출력할 수 있도록 메뉴를 구성해 주세요!
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("책의 제목을 입력하세요.[공백없이 입력하세요.]");
			String title = in.next();
			if(title.equals("exit")) break; //System.exit(0); -> scanner까지 종료시키는 것
			else {
				System.out.println("책의 금액을 입력하세요.");
				int price = in.nextInt();
				System.out.println("책의 수량을 입력하세요.");
				int num = in.nextInt();
				
				book[i] = new Book(title, price, num);
				book[i].print();
				i++;
			}
		}

	}

}
