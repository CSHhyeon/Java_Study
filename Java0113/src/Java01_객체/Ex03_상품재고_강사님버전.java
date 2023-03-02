package Java01_객체;

public class Ex03_상품재고_강사님버전
{
	String goodsCode;	//상품코드
	int stockNum;		//재고수량
	
	Ex03_상품재고_강사님버전() {}
	Ex03_상품재고_강사님버전(String code, int num){ //기본생성자 생성하면서 초기화하기 위함
		this.goodsCode = code;
		this.stockNum = num;
	}
	
	public void addStock(int num) {
		this.stockNum += num;
		System.out.println("요청하신 상품이 " + num + "개가 채워졌습니다.");
	}
	
	public void substractStock(int num) {
		if(this.stockNum - num > 0) {
			this.stockNum -= num;
			System.out.println("요청하신 상품이 " + num + "개가 출고되었습니다.");
		}
		else System.out.println(" 현재 상품의 재고가 부족합니다.");
	}
	
	public void printInfo() {
		System.out.println("현재 재고상태 정보");
		System.out.println("상품코드: " + this.goodsCode + "의 재고량은" + this.stockNum + "입니다.");
	}
}
