package Java01_미니프로젝트.sec03_클래스3개로나눈것;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function	//코드의 간결화를 위해 함수화시킨 함수들의 클래스
{
	Scanner sc = new Scanner(System.in);
	
	//메뉴 출력 함수
	public void print() {
		System.out.println("-----------------------");
		System.out.println("[메뉴 선택]");
		System.out.println("1. 전화번호 리스트 조회");
		System.out.println("2. 전화번호 입력");
		System.out.println("3. 전화번호 조회");
		System.out.println("4. 전화번호 삭제");
		System.out.println("5. 종료");
	}
	
	//동일한 이름의 개수 반환 함수[동일한 이름 입력 시 키값을 '이름 + 중복개수'로 바꿔 저장하기 위함]
	public int findSameName(Map<String, Person> people, String name) {	
		int sameNum = 0;
		for(String k : people.keySet()) {
			if(people.get(k).getName().equals(name)) {
				sameNum++;
			}
		}
		return sameNum;
	}
	
	//이름 형식 입력 확인 함수 -> ^ : 문자열의 시작, * : 앞 문자가 없을 수도 무한정 많을 수도 있음, $ : 문자열의 종료
	public static boolean checkName(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Zㄱ-ㅎ가-힣]*$");
		Matcher matcher = pattern.matcher(name);
		if(matcher.matches()) return true;
		else return false;
	}
	
	//전화번호 형식 ***-****-****로 입력 확인 함수 -> {} : 횟수 또는 범위, \d : 숫자 [0-9]와 동일
	public static boolean checkNumber(String number) {
		Pattern pattern = Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");
		Matcher matcher = pattern.matcher(number);
		if(matcher.matches()) return true;
		else return false;
	}
	
	//이메일 형식 ~~~@도메인 입력 확인 함수 -> ? : 앞 문자가 없거나 하나있음
	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) return true;
		else return false;
	}
	
	//전화번호 중복 안되게 하는 함수. ownName -> 사용자의 이름, number -> 사용자의 전화번호
	public boolean haveNumber(Map<String, Person> people, String ownName, String number) {
		boolean haveNumber = false;
		for(String k : people.keySet()) {
			if(people.get(k).getName().equals(ownName)) {
				if(people.get(k).getNumber().equals(number)) {
					haveNumber = true;
				}
			}
		}
		return haveNumber;
	}
	
	//동명이인있을 때 전화번호를 입력받고 키값을 출력해주는 함수
	public String haveNameWriteNumber(Map<String, Person> people) {
		System.out.println("동명이인이 있습니다. 전화번호를 입력해주세요.");
		System.out.println("전화번호 입력 : ");
		String number = sc.next();
		while(!checkNumber(number)) {
			System.out.println("전화번호 입력 형식이 잘못되었습니다. xxx-xxxx-xxxx로 입력하세요.");
			System.out.println("전화번호 입력 : ");
			number = sc.next();
		}
		//전우치 이름이 2개라면 2번째 전우치는 '전우치2'가 키값이다. 그래서 입력받은 전화번호로 키값을 구해내기 위한 부분.
		String thisKey = "notFound";
		for(String num : people.keySet()) {
			if(people.get(num).getNumber().equals(number)) {
				thisKey = num;
			}
		}
		return thisKey;
	}
	
	//조회 출력 함수. -> 코드의 간결화를 위하야..
	public void printFind(Map<String, Person> people, String findName) {
		System.out.println("[" + people.get(findName).getName() + "님의 데이터]");
		System.out.println("이름 : " + people.get(findName).getName());
		System.out.println("전화번호 : " + people.get(findName).getNumber());
		System.out.println("이메일 : " + people.get(findName).getEmail());
	}
}
