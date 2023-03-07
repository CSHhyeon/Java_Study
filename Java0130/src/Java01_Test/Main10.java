package Java01_Test;

import java.io.UnsupportedEncodingException;

public class Main10
{
	public static void main(String[] args)
	{
		String str_code1 = " + -- + - + - ";
		String str_code2 = " + --- + - + ";
		String str_code3 = " + -- + - + - ";
		String str_code4 = " + - + - + - + ";
		
		int code1 = Integer.parseInt(change(str_code1), 2);
		int code2 = Integer.parseInt(change(str_code2), 2);
		int code3 = Integer.parseInt(change(str_code3), 2);
		int code4 = Integer.parseInt(change(str_code4), 2);
		
		System.out.printf("%c", code1);
		System.out.printf("%c", code2);
		System.out.printf("%c", code3);
		System.out.printf("%c", code4);
	}
	
	public static String change(String str) {
		str = str.replaceAll(" ", "");
		char[] changeChar = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(changeChar[i] == '+') {
				changeChar[i] = '1';
			}
			else if(changeChar[i] == '-') {
				changeChar[i] = '0';
			}
		}
		str = String.valueOf(changeChar);
		return str;
	}
}
