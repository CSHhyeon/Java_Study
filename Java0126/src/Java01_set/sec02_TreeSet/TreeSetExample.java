package Java01_set.sec02_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample
{
	//무작위로 저장한 점수를 검색하는 방법을 제시하는 예제
	public static void main(String[] args)
	{
		TreeSet<Integer> scores = new TreeSet<>();
		
		//무작위로 점수를 scores에 저장
		scores.add(80);
		scores.add(90);
		scores.add(78);
		scores.add(98);
		scores.add(77);
		scores.add(55);
		
		for(Integer s : scores) {
			System.out.print("점수 : " + s + "점\t");
		}
		System.out.println();
		
		//특정 점수 객체를 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first() + "점");
		System.out.println("가장 높은 점수 : " + scores.last() + "점");
		System.out.println("95점 바로 아래 점수 : " + scores.lower(95) + "점");
		System.out.println("95점 바로 위 점수 : " + scores.higher(95) + "점");
		System.out.println("95점 출력(단, 95점이 없다면 바로 아래 점수 출력) : " + scores.floor(95) + "점");
		System.out.println("95점 출력(단, 95점이 없다면 바로 위 점수 출력) : " + scores.ceiling(95) + "점");
		
		//내림차순으로 정렬 -> descendingSet() : 내림차순으로 정렬된 NavigableSet을 리턴
		NavigableSet<Integer> descending = scores.descendingSet();
		for(Integer score : descending) {
			System.out.print("score : " + score + "점\t");
		}
		System.out.println();
		
		//범위 검색 (80 <= scores) -> API 이용해 찾아보고 만들기
		NavigableSet<Integer> under = scores.tailSet(80, true);
		for(Integer score : under) {
			System.out.print("score : " + score + "점\t");
		}
		System.out.println();
		
		//범위 검색 (80 <= scores < 90)
		NavigableSet<Integer> between = scores.subSet(80, true, 90, false);
		for(Integer score : between) {
			System.out.print("score : " + score + "점\t");
		}
		System.out.println();
	}

}
