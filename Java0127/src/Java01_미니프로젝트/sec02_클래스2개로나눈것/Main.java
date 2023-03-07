package Java01_미니프로젝트.sec02_클래스2개로나눈것;

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
		PhoneDao dao = new PhoneDao();
		int input = 0;
		
		do {
			try {
				dao.print();
				System.out.println("선택 : ");
				input = sc.nextInt();
				switch(input) {
				case 1 :
					dao.list();
					break;
				case 2 :
					dao.input();
					break;
				case 3 :
					dao.find();
					break;
				case 4:
					dao.remove();
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
				System.out.println("입력으로는 숫자만 들어올 수 있습니다. 오류 발생으로 시스템을 종료합니다.");
				break;
			}
			
		}while(input != 5);
	}
}
