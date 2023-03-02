package Java_array;

public class ArrayEx02_2
{

	public static void main(String[] args)
	{
		int[] arr = makeIntArray(5);
		int sum = sumOfArray(arr);
		System.out.println(sum);
		double average = averageOfArray(sum, arr.length);
		System.out.println(average);
		
		//함수를 만들어서 또 코딩하지 않아도 편하게 계산 가능
		arr = makeIntArray(10);
		sum = sumOfArray(arr);
		System.out.println(sum);
		average = averageOfArray(sum, arr.length);
		System.out.println(average);
	}
	
	public static int[] makeIntArray(int len) {
		//main 메소드에서 요청한 정수형 5개 공간 배열 arr을 생성하고 값 1~5를 차례로 할당
		int[] arr = new int[len];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	public static int sumOfArray(int[] arr1) { //데이터타입은 맞춰주어야 한다.
		//arr의 배열의 값들의 합을 구한 후 호출한 메인메소드에 전달
		int sum = 0;
		for(int k: arr1) sum += k;
		return sum;
	}
	
	//평균을 구하는 public static double averageOfArray(int sum, int len) 기능을 구현하세요.
	public static double averageOfArray(int sum, int len) {
		return sum / (double)len;
	}
}
