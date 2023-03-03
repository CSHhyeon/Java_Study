package Java02_map.sec04_Comparable.Ex02;

import java.util.TreeSet;

public class FruitExample
{
	//문제 : Fruit 객체에서 Comparable 인터페이스를 구현 : 가격 기준으로 오름차순 정렬
	//FruitExample 클래스에서 과일 객체를 저장하고 가격으로 오름차순 정렬된 과일리스트 출력
	public static void main(String[] args)
	{
		TreeSet<Fruit> fruit = new TreeSet<>();
		
		fruit.add(new Fruit("사과", 2000));
		fruit.add(new Fruit("딸기", 5000));
		fruit.add(new Fruit("바나나", 3000));
		fruit.add(new Fruit("포도", 1000));
		
		for(Fruit f : fruit) {
			System.out.println("과일 이름 : " + f.name + ", 과일 가격 : " + f.price);
		}
	}
}
