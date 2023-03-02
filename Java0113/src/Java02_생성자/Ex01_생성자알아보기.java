package Java02_생성자;

import java.util.Scanner;

class Book1{
	String title;
	int price;
	int num;
	
	Book1(){}	//기본생성자 (default constructor(생성자)) -> 메서드이지만 반환형이 없는 형태
	Book1(String title, int price, int num){ //오버로딩
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

public class Ex01_생성자알아보기
{

	public static void main(String[] args)
	{	
		Book1 myBook = new Book1();	//myBook은 변수, new Book()은 생성자를 만든 것. 만든 생성자의 주소를 변수에 넣은 것
		myBook.title = "노인과 바다";
		myBook.price = 10000;
		myBook.num = 20;
		myBook.print();
		
		System.out.println();
		
		Book1 myBook1 = new Book1("무기여 잘 있거라", 10000, 10);
		myBook1.print();		
	}
}

/* 생성자 : 객체 생성을 할 때만 호출되는 특수한 메서드, new 연산자가 객체의 생성자를 이용하여 객체를 생성한다.
 * 
 * 생성자명은 클래스명과 똑같아야 한다.
 * Book(){} 메서드이지만 반환형이 없는 형태이다. 기본생성자를 기술하지 않으면 자동으로 만들어준다.
 * 단, 생성자 오버로딜 했을 경우는 만들어주지 않으므로 디폴트 생서자가 필요하면 직접 기술해야 한다.
 * 
 * */