package Java_array;
import java.util.*;  // Arrays.toString()을 사용하기 위해 추가

class ArrayEx02_1 {
	public static void main(String[] args) {
		// 배열의 생성 과 초기화 
		int[] iArr1 = new int[10];	//배열 선언
		int[] iArr2 = new int[10];
		
		// 1~10의 숫자를 순서대로 배열에 넣는다.
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}

		// 배열에 저장된 값들을 출력한다.	-> for~each문[인덱스 처리는 하지 못한다.]
		for(int k: iArr1) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		//1~10까지의 범위 내에서 난수를 발생하여 배열 iArr2에 값을 저장한 후 출력하는 코드 작성
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;
			System.out.printf("%d ", iArr2[i]);
		}
		
	}
}
