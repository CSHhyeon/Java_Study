package Java_array;
class ArrayEx01 {
	public static void main(String[] args) { 
		
		//배열의 선언과 초기화 , 값 할당 
		int[] iArr1 = new int[10];	//배열 선언
		int[] iArr2 = new int[] {10, 20, 30, 40, 50};
		

	    // for문으로 배열의 모든 요소를 출력한다.
		for(int i = 0; i < iArr1.length; i++) {
			System.out.printf("iArr1[%d] = %d%n", i, iArr1[i]);
		}
		
		for(int i = 0; i < iArr2.length; i++) {
			System.out.printf("iArr2[%d] = %d%n", i, iArr2[i]);
		}
	
	} // main
}
