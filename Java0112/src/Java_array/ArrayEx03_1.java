package Java_array;

import java.util.Scanner;

class ArrayEx03_1{
	public static void main(String[] args) {
		
		//정수형 길이 사용자에게 지정받아 배열 arr 선언    
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력하세요.");
		int n = sc.nextInt();
		int[] arr = new int[n];	
		
		// 배열 arr에 지정받은 길이만큼의 수를 for문을 이용하여 자동 저장한다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
        
		//배열  arr 길이 출력	
		System.out.printf("arr의 길이 : %d%n", arr.length);
		
		//배열  arr 값 출력 
		System.out.println("===arr의 값 출력===");
		for(int k: arr) System.out.println(k);
		
		//배열  arr 2배 길이의 정수형 배열 tmp 생성   
		int[] tmp = new int[arr.length * 2];
		

		// 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		//System.arraycopy(tmp, 0, arr, 0, arr.length);
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}

		// tmp에 저장된 값을 arr에 저장한다.
		arr = tmp;
		
		//배열  arr 길이 출력	
		System.out.printf("arr의 총 길이 : %d%n", arr.length);
		
		//배열  arr 값 출력
		System.out.println("===arr 값===");
		for(int k : arr) {
			System.out.println(k);
		}
		
	}
}
