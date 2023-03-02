package java07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "black");

		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("컬러: " + myPhone.color);

		//SmartPhone의 필드 읽기
		System.out.println("wifi: " + myPhone.wifi);

		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.internet();
	}
}