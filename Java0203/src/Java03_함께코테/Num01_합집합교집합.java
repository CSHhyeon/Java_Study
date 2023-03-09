package Java03_함께코테;

import java.util.ArrayList;
import java.util.Scanner;

public class Num01_합집합교집합
{
	static ArrayList<String> splitStr(String str) {
		ArrayList<String> split = new ArrayList<String>();
		for(int i = 0; i < str.length() - 1; i++) {
			String newStr = str.substring(i, i + 2);
			split.add(newStr);
		}
		return split;
	}
	
	static double same(ArrayList<String> str1, ArrayList<String> str2) {
		if(str1.size() <= 0 && str2.size() <= 0) return 1;
		
		ArrayList<String> union = new ArrayList<String>();			//합집합
		ArrayList<String> intersection = new ArrayList<String>();	//교집합
		
		//같은 값은 제외시키기
		union.addAll(str1);
		union.addAll(str2);
		
		if(str1.size() > str2.size()) {
			for(int i = 0; i < str1.size(); i++) {
				if(str2.contains(str1.get(i))) {
					intersection.add(str1.get(i));
				}
			}
		}
		else {
			for(int i = 0; i < str2.size(); i++) {
				if(str1.contains(str2.get(i))) {
					intersection.add(str2.get(i));
				}
			}
		}
		
		return intersection.size() / (double) union.size();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		double jaka = same(splitStr(str1), splitStr(str2));
		System.out.printf("%d", (int)(jaka * 65536));
	}
}
