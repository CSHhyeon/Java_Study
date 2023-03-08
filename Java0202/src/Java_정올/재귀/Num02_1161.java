package Java_정올.재귀;

import java.util.Scanner;

public class Num02_1161
{	
	//from: 시작 기둥, to: 목표 기둥, by : 중간 기둥
	public static void move(int num, char from, char by, char to) {
		if(num == 1) System.out.println("1 : " + from + " -> " + to);
		else {
			move(num - 1, from, to, by);	//옮기고자 하는 원반을 제외한 그룹을 중간 기둥으로 옮긴다.
			System.out.println(num + " : " + from + " -> " + to);	//가장 밑에 원반을 목표 지점으로 옮긴다.
			move(num - 1, by, from, to);	//중간 기둥으로 옮겼던 나머지를 가장 큰 원반 위로 옮긴다.
		}
	}
	
	public static void main(String[] args)
	{
		//한 줄에 한 개의 원판을 이동하는 과정을 "원반 번호 : 이동 전 기둥번호 -> 이동 후 기둥번호"
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//1번 기둥에 쌓여있는 원판의 개수
		move(N, '1', '2', '3');
	}
}
