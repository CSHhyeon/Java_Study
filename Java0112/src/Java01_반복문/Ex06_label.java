package Java01_반복문;

import java.util.Scanner;

public class Ex06_label
{

	public static void main(String[] args)
	{
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {	//for(;;) 무한루프
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
			
			String tmp = scanner.nextLine(); //화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue; //while의 시작점으로 돌아간다.
			}
			
			for(;;) {
				System.out.println("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num == 0) break;
				if(num == 99) System.exit(0); //전체 종료. for문과 while문을 모두 벗어난다.
				
				switch(menu) {
				case 1:
					System.out.println("result = " + num * num);
				}
			}
		}


	}

}
