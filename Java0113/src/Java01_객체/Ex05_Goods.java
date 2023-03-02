package Java01_객체;

public class Ex05_Goods
{
	String color;
	private String code;	//private이기 때문에 main에서 직접 접근 불가능! 정보의 은닉화(캡슐화)
	int num;		//클래스는 데이터만 담은 데이터 전용 그릇으로도 사용할 수 있다. -> Data Object
					//꼭 기능적인 것을 써야하는 것이 아니다. 
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
	}
	
}

//자바기본프로그래밍 + 자료구조론 ==> 디자인패턴
//자료구조론, 디자인패턴 연결해서 공부하는 스터디를 만들으면 좋을 것 같다.
