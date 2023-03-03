package Java02_map.sec05_Comparator;
import java.util.TreeSet;

public class FruitComparatorEx
{
	public static void main(String[] args)
	{
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		
		//객체 저장
		treeSet.add(new Fruit("사과", 2000));
		treeSet.add(new Fruit("바나나", 1500));
		treeSet.add(new Fruit("멜론", 3000));
		
		//객체를 하나씩 가져오기
		for(Fruit fruit : treeSet) {
			System.out.println("과일 이름 : " + fruit.name + ", 가격 : " + fruit.price);
		}
	}
}
