package Java_정올;

import java.util.ArrayList;
import java.util.Arrays;

public class Num02_4698
{
	public static void main(String[] args)
	{
		ArrayList<Character> alpha = new ArrayList<>();
		for(char c = 'A'; c <= 'Z'; c++) {
			alpha.add(c);
		}
		
		for(char print : alpha) {
			System.out.printf("%c ", print);
		}
	}
}
