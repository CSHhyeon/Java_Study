package Java03_배열;

public class Ex01_배열알아보기
{

	public static void main(String[] args)
	{
		int[] score = new int[5];
		
		//10개의 정수형 값을 저장할 수 있는 iARR1 배열 생성하기.
		int[] iArr1 = new int[10];	//또는 int iArr1[] = new int[10];
		
		//score 배열 객체의 첫 번째 공간에 100 할당, 두 번째 공간에 70, 세 번째 공간에 80, 네 번째 공간에 90, 다섯번째 공간에 77 넣기
		score[0] = 100;
		score[1] = 70;
		score[2] = 80;
		score[3] = 90;
		score[4] = 77;
		
		//정수형 temp 변수에 score[1]과 score[4]의 정수의 합을 저장하시오.
		int temp = score[1] + score[4];	//147
		
		//temp의 값을 score[4]에 저장하시오.
		score[4] = temp;
		
		//출력 (for: 반복문 이용)
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] = %d%n", i, score[i]);
		}

	}

}
