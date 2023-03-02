package java05.sec02_1;

//배열로 처리하는 성적관리 프로그램
public class MultidimensionalArray_mine {
	public static void main(String[] args) {
		//멀티잇학교 3학년은 2반 있다. 각의 학생 수가 10명로 동일하다. 점수를저장 위한 2차원 배열 mathScores 생성하시오
		//int[][] mathScores= null;
		int[][] mathScores= {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},};
		
		//mathScores 배열 항목 초기값 출력하세요
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				System.out.printf("%d ", mathScores[i][j]);
			}
			System.out.println();
		}
		          						
		System.out.println();
		
		//mathScores배열의 항목(학생 성적) 값을 스캐너 클래스를 이용하여 입력가능. 또는 랜덤 사용 가능.
		//전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
				
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				mathScores[i][j] = (int)(Math.random() * 101);
				System.out.printf("%d ", mathScores[i][j]);
				totalStudent++;
				totalMathSum += mathScores[i][j];
			}
			System.out.println();
		}
	
		System.out.println();
			
		double totalMathAvg = totalMathSum / (double)totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();
	
		
		//==================아래는 영어 점수 출력======================
		
		//각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성하였습니다.
		int[][] englishScores = {{0, 0}, {0, 0, 0},};
		
		//첫번재 반의 학생수는 2명 , 두번째 반의 학생수는 3명입니다. 배열을 선언하세요.
		//englishScores 배열 항목 초기값 출력
		int num = 0;
		for(int i = 0; i < englishScores.length; i++) {
			if(i == 0) num = 2;
			else num = 3;
			
			for(int j = 0; j < num; j++) {
				System.out.printf("%d ", englishScores[i][j]);
			}
			System.out.println();
		}	 
		
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
		for(int i = 0; i < englishScores.length; i++) {
			if(i == 0) num = 2;
			else num = 3;
			
			for(int j = 0; j < num; j++) {
				totalStudent++;
				totalEnglishSum += englishScores[i][j];
				System.out.printf("%d ", englishScores[i][j]);
			}
			System.out.println();
		}
		
		double totalEnglishAvg = totalEnglishSum / (double)totalStudent; 
		System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
	}
}			