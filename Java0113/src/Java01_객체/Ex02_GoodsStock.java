package Java01_객체;

public class Ex02_GoodsStock
{
	String[] goodsCode = {"choco", "cookie", "candy"};
	int[] stockNum = {3, 5, 0};
	int a = 0;
	
	void checkCode(String Code) {
		for(int i = 0; i < 3; i++) {
			if(Code == this.goodsCode[i]) a = i;
		}
	}
	
	void addStock(String Code) {
		checkCode(Code);
		++stockNum[a];
		System.out.println(stockNum[a]);
	}
	
	void subtractStock(String Code) {
		checkCode(Code);
		if(stockNum[a] == 0) System.out.println("이미 재고가 없습니다.");
		else {
			--stockNum[a];
			System.out.println(stockNum[a]);
		}
	}
	
	void infoPrint(String Code) {
		checkCode(Code);
		System.out.println("입력된 상품 코드는 : " + this.goodsCode[a]);
		System.out.println("현재 상품의 재고는 : " + this.stockNum[a]);
	}
}
