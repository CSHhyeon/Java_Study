package Java02.base.Arrays;

import java.util.Arrays;

class INum1{
	private int num;
	
	INum1(int num){
		this.num = num;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this.num == ((INum1)obj).num) return true;
		else return false;
	}
}

public class Ex01_배열비교
{
	public static void main(String[] args)
	{
		//1. 객체 저장한 배열의 비교
		INum1[] arr1 = new INum1[2];
		INum1[] arr2 = new INum1[2];
		
		arr1[0] = new INum1(1);
		arr2[0] = new INum1(1);
		
		arr1[1] = new INum1(2);
		arr2[1] = new INum1(2);
		
		System.out.println(Arrays.equals(arr1, arr2));	//참조값을 비교
	}
}

/* Arrays 클래스 사용
 * - 배열의 초기화, 값 채우기, 복사, 정렬 가능
 * - 배열에 객체를 저장해 사용 가능
 * */
