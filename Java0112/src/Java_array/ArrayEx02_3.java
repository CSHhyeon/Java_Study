package Java_array;

class Calculator{
	public int[] makeIntArray(int len) {
		//main 메소드에서 요청한 정수형 5개 공간 배열 arr을 생성하고 값 1~5를 차례로 할당
		int[] arr = new int[len];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	public int sumOfArray(int[] arr1) { //데이터타입은 맞춰주어야 한다.
		//arr의 배열의 값들의 합을 구한 후 호출한 메인메소드에 전달
		int sum = 0;
		for(int k: arr1) sum += k;
		return sum;
	}
	
	//평균을 구하는 public static double averageOfArray(int sum, int len) 기능을 구현하세요.
	public double averageOfArray(int sum, int len) {
		return sum / (double)len;
	}
}

public class ArrayEx02_3
{
	public static void main(String[] args)
	{
		Calculator call = new Calculator();
		int[] arr = call.makeIntArray(5);
		int sum = call.sumOfArray(arr);
		System.out.println(sum);
		double avg = call.averageOfArray(sum, arr.length);
		System.out.println(avg);
		
		Calculator call2 = new Calculator();
		int[] arr2 = call2.makeIntArray(15);
		int sum2 = call2.sumOfArray(arr2);
		System.out.println(sum2);
		double avg2 = call2.averageOfArray(sum2, arr2.length);
		System.out.println(avg2);
	}
}
