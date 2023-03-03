package Practice.num01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;

public class MapExample
{
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	//최고 점수를 받은 아이디를 저장
		int maxScore = 0;	//최고 점수를 저장
		int totalScore = 0;	//점수 합계를 저장
		
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> m : map.entrySet()) {
			totalScore += m.getValue();
			if(maxScore < m.getValue()) {
				maxScore = m.getValue();
				name = m.getKey();
			}
		}
		
		/*
		Set<String> keySet = map.keySet();
		for(String k: keySet) {
			// sum
			totalScore += map.get(k);
			
			// max score
			if(map.get(k) > maxScore) {
				maxScore = map.get(k);
				name = k;
			}
		}
		*/
		
		System.out.println("평균 점수 : " + (totalScore / (float)map.size()));
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
	}
}
