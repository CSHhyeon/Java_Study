package Java02_조건문_반복문;

import java.util.Scanner;

public class Ex02_if중첩문
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Ctrl+Shift+O -> 자동 import 단축키
		System.out.println("점수를 입력해주세요.");
		int score = sc.nextInt();	//next()는 문자열, nextInt()는 정수형이다.
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
				grade = grade + "+";  //grade += "+"; -> 문자열1 + 문자열2 = 문자열1문자열2
			}
			else if(score < 94){
				grade += "-";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score >= 88) {
				grade = grade + "+";  //grade += "+"; -> 문자열1 + 문자열2 = 문자열1문자열2
			}
			else if(score < 84){
				grade += "-";
			}
		}
		else {
			grade = "C";
		}
		System.out.println("당신의 학점은 : " + grade + "입니다.");
	}
}
