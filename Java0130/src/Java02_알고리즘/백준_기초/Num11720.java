package Java02_알고리즘.백준_기초;

import java.util.Scanner;

public class Num11720
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
	}
}

/* 1. N
 * 
 * 2. 문자 배열로 반환
 * 3. 문자 배열값을 순서대로 읽으면서 숫자형으로 변환하여 더한다.
 * "1234" ==> '1', '2', '3', '4' ==> 1, 2, 3, 4 ==> 1 + 2 + 3 + 4 ==> 10
 * 
 * tip) 문자열 ==> 숫자형 변경하려면 아스키코드 이해
 * 같은 의미의 문자와 숫자의 코드값 차이는 48
 * 문자 '1' ==> 49, 문자 '1'을 숫자 1로 변환하여면 '1' - 48 = 1(숫자)
 * 
 * */
