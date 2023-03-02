package Java01_객체;

public class Ex01_TV_2
{
	//Ex01_TV_1에 만든 설계도를 인스턴스화!
	public static void main(String[] args)
	{
		Ex01_TV_1 tv1 = new Ex01_TV_1();	//이름으로 호출
		tv1.color = "red";
		tv1.channel = 10;
		tv1.channelUp();
		tv1.channelDown();
		tv1.infoPrint();
		
		Ex01_Samsung tv2;
		tv2 = new Ex01_Samsung();
		tv2.infoPrint();
		
		//퀴즈 : 삼성티비 100개를 인스턴스화하여 현재 정보를 출력하는 코드 작성. : 배열, for문
		Ex01_Samsung[] arr = new Ex01_Samsung[100]; //Ex01_Samsung 객체 100개를 담는 배열 생성
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Ex01_Samsung();	//각 배열에 할당
			arr[i].infoPrint();
		}
		
	}

}
