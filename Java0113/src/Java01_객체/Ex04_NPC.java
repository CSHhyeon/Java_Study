package Java01_객체;
//클래스 정의 : 객체를 추상화해 놓은 곳 (이름으로)
public class Ex04_NPC
{
	 Ex01_TV_1 tv = new Ex01_TV_1();
	
	//필드 : 데이터
	String name;
	int hp;
	
	//메서드 : 동작에 관련된 기능
	void say() {
		System.out.println("haha!");
		tv.infoPrint();//이렇게 다른 클래스도 불러와서 사용 가능!
	}
	

}
//클래스를 정의한다.
