package Java03_컬렉션.sec03.Map01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx
{
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap();
		
		map.put("김멀티", 30);
		map.put("이멀티", 30);
		map.put("최멀티", 30);
		map.put("강멀티", 20);
		map.put("강멀티", 30); //같은 키로 들어온 마지막값이 저장된다. 30이 저장된다.
		
		System.out.println("총 엔트리 수 : " + map.size()); //강멀티 키가 같기 때문에 하나만 저장이 된다.
		
		//키를 이용해 값 얻기
		String key = "최멀티";
		int value = map.get(key);
		System.out.println(value);
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keyset = map.keySet();
		Iterator<String> keyiterator = keyset.iterator();
		while(keyiterator.hasNext()) {
			String k = keyiterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
