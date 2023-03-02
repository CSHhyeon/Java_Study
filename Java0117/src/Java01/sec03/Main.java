package Java01.sec03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Magician을 생성해 주세요
		Magician me = new Magician(sc.next());
		
		//교전 전에 getInfo()로 상태를 점검합니다.
		me.getInfo();
		
		//hunt()로 사냥해 주세요
		me.hunt();
		me.fireball();
		
		//사냥이 끝난 후 다시 상태 getInfo()를 점검합니다.
		me.getInfo();
		me.heal();
		me.getInfo();
	}

}
