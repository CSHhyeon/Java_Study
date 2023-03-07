package Java01_미니프로젝트.sec03_클래스3개로나눈것;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneDao extends Function //DAO(Data Access Object) : 데이터를 처리해주는 객체
{
	Scanner sc = new Scanner(System.in);
	
	Map<String, Person> people = new HashMap<>();

	//'1' 입력 시 -> 전체 리스트 출력 함수
	public void list() {
		int i = 0;
		Set<String> key = people.keySet();
		for(String k : key) {
			System.out.println("[" + (++i) + "]");
			System.out.println("\t이름 : " + people.get(k).getName());
			System.out.println("\t전화번호 : " + people.get(k).getNumber());
			System.out.println("\t이메일 : " + people.get(k).getEmail());
		}
	}
	
	//'2' 입력 시 -> 이름-전화번호-이메일 입력 후 저장 함수
	public void input() {
		System.out.println("이름 입력 : ");
		String name = sc.next();
		String ownName = name;
		
		//이름 형식(한국어 또는 영어) 제대로 입력할때까지 입력받음.
		while(!checkName(name)) {
			System.out.println("이름은 한국어 또는 영어만 입력할 수 있습니다.");
			System.out.println("이름 입력 : ");
			name = sc.next();
			ownName = name;
		}
		
		//중복 이름이 있다면 "이름 + 중복값개수"로 키를 저장.
		if(people.containsKey(name)) {
			int sameNum = findSameName(people, name);
			name += sameNum;
		}
		
		System.out.println("전화번호 입력 : ");
		String number = sc.next();
		
		//전화번호 형식 제대로 입력할때까지 입력받음.
		while(!checkNumber(number)) {	
			System.out.println("전화번호 입력 형식이 잘못되었습니다. xxx-xxxx-xxxx로 입력하세요.");
			System.out.println("전화번호 입력 : ");
			number = sc.next();
		}
		
		//이름, 전화번호가 모두 동일한 데이터 유무 확인
		if(haveNumber(people, ownName, number)) {
			System.out.println("이미 있는 데이터입니다.");
		}
		else {
			System.out.println("이메일 입력 : ");
			String email = sc.next();
			
			while(!checkEmail(email)) {
				System.out.println("이메일 입력 형식이 잘못되었습니다. ***@도메인 형식으로 입력하세요.");
				System.out.println("이메일 입력 : ");
				email = sc.next();
			}
			
			System.out.println("입력한 정보를 저장합니다.");
			Person p = new Person(ownName, number, email);
			people.put(name, p);
		}
	}
	
	//'3' 입력 시 -> 이름 입력 후 조회하는 함수
	public void find() {
		System.out.println("조회할 이름 : ");
		String findName = sc.next();
		
		//입력한 이름의 키가 있는지 확인
		if(people.containsKey(findName)) {
			//동일한 이름이 2개 이상인지 확인 후 동일한 이름이 있다면 전화번호 입력받음
			if(findSameName(people, findName) > 1) {
				//입력받은 전화번호의 유무 확인
				String thisKey = haveNameWriteNumber(people);
				if(thisKey.equals("notFound")) {
					System.out.println("해당 데이터가 없습니다.");
				}
				else {
					printFind(people, thisKey);
				}
			}
			else {
				printFind(people, findName);
			}
		}
		else {
			System.out.println("해당 데이터가 없습니다.");
		}
	}
	
	//'4' 입력 시 -> 데이터 제거하는 함수
	public void remove() {
		System.out.println("삭제할 이름 : ");
		String removeName = sc.next();
		
		//입력한 이름의 키가 있는지 확인
		if(people.containsKey(removeName)) {
			//동일한 이름이 2개 이상인지 확인 후 동일한 이름이 있다면 전화번호 입력받음
			if(findSameName(people, removeName) > 1) {
				//입력받은 전화번호의 유무 확인
				String thisKey = haveNameWriteNumber(people);
				if(thisKey.equals("notFound")) {
					System.out.println("해당 데이터가 없습니다.");
				}
				else {
					people.remove(thisKey);
					System.out.println("데이터 삭제를 완료했습니다.");
				}
			}
			else {
				people.remove(removeName);
				System.out.println("데이터 삭제를 완료했습니다.");
			}
		}
		else {
			System.out.println("해당 데이터가 없습니다.");
		}
	}
}
