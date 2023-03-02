package java07.sec07.exam01;
class A{}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}


public class PromotionExample {  //promotion = 자동타입변환
	public static void main(String[] args) {
		
		B b = new B();  //B + A
		C c = new C();  //C + A
		D d = new D();  //D + B + A
		E e = new E();  //E + C + A
		
		//부모에게 담기는지 확인
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;  //자동타입변환 ==> 상속 관계가 있구나~ 즉, B, C, D, E가 A를 부모로 가지는구나!
		B a5 = d;
		C a6 = e;
		
		//B b1 = e; -> E는 B와 전혀 관계가 없다. 그래서 안된다. [상속 관계에 있지 않음.]
		//C b2 = d; -> D와 C도 전혀 관계가 없어서 안된다.
		
		
		
	}
}

/* 자동타입변환(Promotion) : 자동적으로 타입 변환이 일어난다.
 * 조건 : 부모타입 변수 = 자식타입 변수;   //=를 기준으로 왼쪽에 부모 타입, 오른쪽에 자식 타입이 있으면 자동 형변환이 된다.
 * 
 * '고양이는 동물이다.'를 아래와 같이 표현 가능. Animal이 부모, Cat이 자식이다.
 * Cat cat =  new Cat();
 * Animal animal = cat;			//Animal animal = new Cat();으로 한줄로 표현도 가능!
 * 
 * */
 