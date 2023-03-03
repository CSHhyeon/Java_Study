package Java02_map.sec01_HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentScores
{
	public static void main(String[] args)
	{
		// key: 이름, Value: 점수인 HashMap만들기
		//1. 컬렉션 생성 -> Entry 객체로 만들면 좋겠구나! HashMap 컬렉션 생성하자.
		Map<String, Integer> scores = new HashMap<>(); //HashMap<String, Integer> scores = new HashMap<>();해도 상관X
		
		//2. 학생 객체 저장
		scores.put("김지영", 98);
		scores.put("이지영", 90);
		scores.put("최지영", 91);
		scores.put("박지영", 92);
		scores.put("소지영", 93);
		
		//3. key를 이용해 김지영 학생의 점수를 출력
		System.out.println("김지영 : " + scores.get("김지영"));
		System.out.println();
		
		//4. 학생의 이름과 점수를 확인하였으면, Set에 학생들의 이름과 점수 정보를 저장하고, 저장된 학생리스트를 출력
		slist_print(scores);
		System.out.println();
		
		//5. 학생 중 소지영 학생이 전학을 갔다. 학생 리스트(scores)에서 삭제 처리하고 리스트 출력
		System.out.println("소지영이 전학갔다.");
		scores.remove("소지영");
		slist_print(scores);	
	}
	
	//6. 출력 기능을 public static slist_print() 독립된 기능으로 구현
	public static void slist_print(Map<String, Integer> scores) {
		//학생리스트 출력기능 구현
		//Iterator<String> iterator = scores.keySet().iterator();	-> 한 줄로도 가능
		Set<String> list = scores.keySet();				//keySet() : 모든 키를 Set 객체에 담아 리턴 -> 중복 허용하기 싫어서 Set에 넣음
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {						//hasNext() : Iterator 안에 다음 값이 들어있는지 확인
			String key = iterator.next();				//iterator의 다음 값 가져오기
			Integer value = scores.get(key);
			System.out.println(key + " : " + value);
		}
	}
	
	/* for 사용하는 방법
	public static void slist_print(Map scores) {
		Set<String> keySet = scores.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + scores.get(key));
        }
	}
	*/
	
	/* 제네릭 사용하는 방법
	public static<T> void slist_print(T obj) {
		Set<String> objset=((Map<String, Integer>) obj).keySet();
		Iterator<String> set=objset.iterator();
		while(set.hasNext()) {
			String name=set.next();
			Integer score=((Map<String, Integer>) obj).get(name);
			System.out.println(name+" "+score);
		}
	}
	*/
}

