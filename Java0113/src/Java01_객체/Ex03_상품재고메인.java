package Java01_객체;

public class Ex03_상품재고메인
{

	public static void main(String[] args)
	{
		Ex03_상품재고_강사님버전  airpot2 = new Ex03_상품재고_강사님버전();  //GoodStock의 기본 생성자
		airpot2.goodsCode = "Air2389T"; //초기값 주기
		airpot2.stockNum = 30;

		Ex03_상품재고_강사님버전  airpot3 = new Ex03_상품재고_강사님버전("Air2398T1", 40); //생성자 오버로딩에 의한 초기화
		airpot3.addStock(10);
		airpot3.substractStock(5);
		airpot3.printInfo();
	}

}
