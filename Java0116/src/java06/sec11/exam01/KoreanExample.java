package java06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		//객체 생성 시 주민등록번호와 이름 전달
		Korean k1 = new Korean("123456-1234567", "김멀티");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

		//Final 필드는 값을 변경할 수 없음
		//k1.nation = "USA";
		//k1.ssn = "123-12-1234";

		//비 final 필드는 값 변경 가능
		k1.name = "김자바";
	}
}

/* final : 클래스, 메소드, 필드 앞에 선언될 수 있다.
 * 클래스 -> 상속 금지(변경 불가)
 * 메소드 -> 오버라이딩 금지
 * 필드 -> 할당 금지
 * final은 변경하지 못하도록 금지가 되는 것이다. 상수(constant)인 것.
 * 
 * final 필드에 초기값 줄 수 있는 방법이 딱 두 가지가 있다.
 * 1. 필드 선언 시 초기값 대입
 * 2. 생성자를 이용해 초기값 대입
 * */