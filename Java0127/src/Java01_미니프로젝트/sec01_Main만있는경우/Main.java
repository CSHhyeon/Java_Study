package Java01_미니프로젝트.sec01_Main만있는경우;

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> nameNumber = new HashMap<>();
		HashMap<String, String> nameEmail = new HashMap<>();
		int input = 0;
		
		do {
			try {
				print();
				System.out.println("선택 : ");
				input = sc.nextInt();
				switch(input) {
				case 1 :
					int i = 0;
					Set<String> key = nameNumber.keySet();
					for(String k : key) {
						System.out.println("[" + (++i) + "]");
						System.out.println("\t이름 : " + k);
						System.out.println("\t전화번호 : " + nameNumber.get(k));
						System.out.println("\t이메일 : " + nameEmail.get(k));
					}
					break;
				case 2 :
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
					break;
				case 3 :
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
					break;
				case 4:
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
					break;
				case 5 :
					System.out.println("시스템을 종료합니다.");
					break;
				default :
					System.out.println("잘못된 입력값입니다.");
					break;
				}
			}
			catch(InputMismatchException e){
				System.out.println("입력으로는 숫자만 들어올 수 있습니다.");
				break;
			}
		}while(input != 5);
		
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
