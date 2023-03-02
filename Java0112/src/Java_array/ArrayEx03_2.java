package Java_array;

import java.util.Arrays;

public class ArrayEx03_2
{

	public static void main(String[] args)
	{
		/* 자바의 배열복사 방법
		 * 1. System 클래스의 arraycopy 메소드 -*
		 * 2. Arrays 클래스의 copyOf() 메소드 -*
		 * 3. Object 클래스의 clone() 메소드 -**** 이전 배열과 같은 길이의 배열 복사
		 * 4. for문과 인덱스를 이용한 복사 -* 배열의 길이를 마음대로 늘일 수 있다.
		 * */
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int len = 10;
		
		// 1. System 클래스의 arraycopy 메소드 
		//System.arraycopy(어떤 배열을 복사할 건지, len, 어느 배열에 붙여넣기 할 건지, len, 얼만큼을 복사할건지)
		int[] arr2 = new int[len];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		// 2. Arrays 클래스의 copyOf() 메소드
		int[] arr3 = Arrays.copyOf(arr1, 10);	//Arrays.copyOf(어떤 배열을, 얼마만큼 복사할건지)
		
		// 3. Object 클래스의 clone() 메소드 -**** 이전 배열과 같은 길이의 배열 복사
		int[] arr4 =(int[]) arr1.clone();	//Object라서 타입 형변환 필요하다. 17버전에서는 int[] 없어도 됨.
		
		for(int a: arr2) System.out.printf("%d ", a);
		System.out.println();
		for(int a: arr3) System.out.printf("%d ", a);
		System.out.println();
		for(int a: arr4) System.out.printf("%d ", a);
		System.out.println();
		
	}

}
