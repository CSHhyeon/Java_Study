package java07.sec09;

public class InstanceofExample {
	//main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
		//person이 참조하는 객체가 Student 타입인지 확인. Student라면 아래처럼 출력시키기
		// name : 황초롱
		// 걷습니다.
		// studentNo : 1234
		// 공부를 합니다.  
		if(person instanceof Student) {
			System.out.println("name: " + person.name);
			person.walk();
			System.out.println("studentNo : " + ((Student)person).studentNo);
			((Student)person).study();

			/* 위와 갗은 것
			Student s1 = (Student)person;
			System.out.println("studentNo : " + s1.studentNo);
			s1.study();
			*/
		}
		else {
			System.out.println("name: " + person.name);
			person.walk();
		}	
	}

	public static void main(String[] args) {
		//Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p1 = new Person("김멀티");
		personInfo(p1);
		System.out.println();

		//Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student("황초롱", 1234);	//Person 객체 사용
		personInfo(p2);
	}
}