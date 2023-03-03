package Java02_map.sec03_TreeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample
{
	//영어단어 - 페이지번호 무작위로 저장하고 검색하는 방법 : TreeMap
	public static void main(String[] args)
	{
		//1. TreeMap 컬렉션 생성
		TreeMap<String, Integer> englishindex = new TreeMap<>();
		
		//2. 엔트리 저장
		englishindex.put("apple", 10);
		englishindex.put("forever", 60);
		englishindex.put("description", 40);
		englishindex.put("ever", 50);
		englishindex.put("zoo", 80);
		englishindex.put("guess", 70);
		englishindex.put("guess", 70);	//Set이라서 중복 허용을 안하기 때문에 얘는 무시된다.
		englishindex.put("cherry", 30);
		
		//3. 정렬된 엔트리 하나씩 가져오기 -> 기본으로 오름차순 정렬이 되어 있다.
		Set<Entry<String, Integer>> entrySet = englishindex.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
		System.out.println("==================================================================");
		
		//4. 특정 키의 값 가져오기
		Entry<String, Integer> entry = null;
		entry = englishindex.firstEntry();	//제일 앞 단어 가져오기
		System.out.println("제일 앞 단어 -> " + "key : " + entry.getKey() + ", value : " + entry.getValue());
		
		entry = englishindex.lastEntry();	//제일 뒷 단어 가져오기
		System.out.println("제일 뒷 단어 -> " + "key : " + entry.getKey() + ", value : " + entry.getValue());
		
		entry = englishindex.lowerEntry("ever");	//주어진 키보다 바로 아래(앞) 단어 가져오기
		System.out.println("ever 바로 앞 단어 -> " + "key : " + entry.getKey() + ", value : " + entry.getValue());
		
		entry = englishindex.higherEntry("ever");	//주어진 키보다 바로 위(뒤) 단어 가져오기
		System.out.println("ever 바로 뒷 단어 -> " + "key : " + entry.getKey() + ", value : " + entry.getValue());
		
		
		System.out.println("==================================================================");
		
		//5. 내림차순 정렬
		NavigableMap<String, Integer> descendingMap = englishindex.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		for(Entry<String, Integer> show : descendingEntrySet) {
			System.out.println("key : " + show.getKey() + ", value : " + show.getValue());
		}
		
		System.out.println("==================================================================");
		
		//6. 범위 검색 (c~h 사이의 단어 검색)
		NavigableMap<String, Integer> rangeMap = englishindex.subMap("c", true, "h", true);
		for(Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
		}
	}

}
