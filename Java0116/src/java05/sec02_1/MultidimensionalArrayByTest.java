package java05.sec02_1;

//강사님 버전
public class MultidimensionalArrayByTest {
	public static void main(String[] args) {
		//멀티잇학교 3학년은 2반 있다. 각의 학생 수가 10명로 동일하다. 점수를저장 위한 2차원 배열 mathScores 생성하시오
		int[][] mathScores= null;
		mathScores = new int[2][10];	//자동초기화된다.
		
		//mathScores 배열 항목 초기값 출력하세요
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				System.out.printf("%d ", mathScores[i][j]);
			}
			System.out.println();
		}
	
		System.out.println();
		
		//mathScores배열의 항목(학생 성적) 값
		/*
		 * mathScores[0][0] = 80; mathScores[0][1] = 83; mathScores[0][2] = 85;
		 * mathScores[1][0] = 86; mathScores[1][1] = 90; mathScores[1][2] = 92;
		 */
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				mathScores[i][j] = (int)(Math.random() * 101);
			}
		}
		
		//전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				totalStudent++;
				totalMathSum += mathScores[i][j];
			}
		}
			
		double totalMathAvg = totalMathSum / (double)totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();
	
		//================아래는 영어 점수================
		
		//각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성하였습니다.
		int[][] englishScores = new int[2][];
		
		//첫번재 반의 학생수는 2명 , 두번째 반의 학생수는 3명입니다. 배열을 선언하세요.
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		
		//englishScores 배열 항목 초기값 출력
		
		 
		
		System.out.println();
		//배열 항목 값 변경
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		//전체 학생의 영어 평균 구하기
		totalStudent = 0;
		int totalEnglishSum = 0;
		
		
		
		double totalEnglishAvg; 
		//System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
	}
}			