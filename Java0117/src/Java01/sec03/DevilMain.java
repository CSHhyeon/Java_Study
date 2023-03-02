package Java01.sec03;

import java.util.Scanner;

public class DevilMain
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DevilMagician devil = new DevilMagician(sc.next());
		
		devil.animal = "육식동물";
		devil.getInfo();
		
		devil.hunt();
		devil.fireball();
		devil.getInfo();
		
		devil.heal();
		devil.getInfo();
		
		devil.animal = "초식동물";
		devil.hunt();
		devil.getInfo();
	}

}
