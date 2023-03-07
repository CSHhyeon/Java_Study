package Java01_미니프로젝트.sec02_클래스2개로나눈것;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PhoneDao  //DAO(Data Access Object) : 데이터를 처리해주는 객체
{
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, String> nameNumber = new HashMap<>();
	static HashMap<String, String> nameEmail = new HashMap<>();
	
	public static void input() {
		System.out.println("이름 입력 : ");
		String name = sc.next();
		if(nameNumber.containsKey(name)) {
			System.out.println(name + "데이터가 이미 존재합니다.");
		}
		else {
			System.out.println("전화번호 입력 : ");
			String number = sc.next();
			System.out.println("이메일 입력 : ");
			String email = sc.next();
			System.out.println("입력한 정보를 저장합니다.");
			nameNumber.put(name, number);
			nameEmail.put(name, email);
		}
	}
	
	public static void find() {
		System.out.println("조회할 이름 : ");
		String findName = sc.next();
		if(nameNumber.containsKey(findName)) {
			System.out.println("[" + findName + "님의 데이터]");
			System.out.println("이름 : " + findName);
			System.out.println("전화번호 : " + nameNumber.get(findName));
			System.out.println("이메일 : " + nameEmail.get(findName));
		}
		else {
			System.out.println("해당 데이터가 없습니다.");
		}
	}
	
	public static void remove() {
		System.out.println("삭제할 이름 : ");
		String removeName = sc.next();
		if(nameNumber.containsKey(removeName)) {
			nameNumber.remove(removeName);
			nameEmail.remove(removeName);
			System.out.println("데이터 삭제를 완료했습니다.");
		}
		else {
			System.out.println("해당 데이터가 없습니다.");
		}
	}
	
	public static void list() {
		int i = 0;
		Set<String> key = nameNumber.keySet();
		for(String k : key) {
			System.out.println("[" + (++i) + "]");
			System.out.println("\t이름 : " + k);
			System.out.println("\t전화번호 : " + nameNumber.get(k));
			System.out.println("\t이메일 : " + nameEmail.get(k));
		}
	}
	
	public static void print() {
		System.out.println("-----------------------");
		System.out.println("[메뉴 선택]");
		System.out.println("1. 전화번호 리스트 조회");
		System.out.println("2. 전화번호 입력");
		System.out.println("3. 전화번호 조회");
		System.out.println("4. 전화번호 삭제");
		System.out.println("5. 종료");
	}
}
