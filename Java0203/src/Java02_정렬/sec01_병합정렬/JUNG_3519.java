package Java02_정렬.sec01_병합정렬;

//미완 -> 출력부분
import java.util.ArrayList;
import java.util.Scanner;

public class JUNG_3519
{
	//1. 분할 과정 : 구간의 중앙을 구한다. mid = low + high / 2
	static ArrayList<Integer> Divide(ArrayList<Integer> arr) {
		if(arr.size() <= 1) return arr;
		
		int low = 0;
		int high = arr.size();
		int mid = low + high / 2;
		
		ArrayList<Integer> leftArray = new ArrayList<Integer>(arr.subList(low, mid));	//low부터 mid - 1까지
		ArrayList<Integer> rightArray = new ArrayList<Integer>(arr.subList(mid, high)); //mid부터 high - 1까지
		
		leftArray = Divide(leftArray);
		rightArray = Divide(rightArray);
		
		return Conquer(leftArray, rightArray);
	}
	
	//정복 과정 : 나누어진 두 구간을 각각 재귀적으로 정렬한다.
	static ArrayList<Integer> Conquer(ArrayList<Integer> left, ArrayList<Integer> right) {
		//결합 과정 : 정렬된 두 구간을 이용하여 정렬된 하나의 구간을 만들어 임시 배열 B[]에 저장한다.
		//복사 과정 : 결합이 완성된 임시 배열 B[]를 A[]에 복사한다.
		ArrayList<Integer> B = new ArrayList<Integer>();
		int leftpoint = 0;
		int rightpoint = 0;
		
		//왼쪽, 오른쪽 둘 다 있을 때
		while(left.size() > leftpoint && right.size() > rightpoint) {
			if(left.get(leftpoint) > right.get(rightpoint)) {
				B.add(right.get(rightpoint));
				rightpoint++;
			}
			else {
				B.add(left.get(leftpoint));
				leftpoint++;
			}
		}
		
		//왼쪽만 있을 때
		while(left.size() > leftpoint) {
			B.add(left.get(leftpoint));
			leftpoint++;
		}
		
		//오른쪽만 있을 때
		while(right.size() > rightpoint) {
			B.add(right.get(rightpoint));
			rightpoint++;
		}
		
		for(int print : B) {
			System.out.printf("%d ", print);
		}
		System.out.println();
		return B;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 몇 개의 정수를 입력받을 것인지
		int low = 0;
		int high = N - 1;
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		
		Divide(A);
	}
}
