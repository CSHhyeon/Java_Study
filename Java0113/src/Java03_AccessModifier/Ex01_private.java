package Java03_AccessModifier;

class Student1{
	String name;	//default
	int age;		//default
}

 class Student2{
	 public String name;
	 private int age;
	 
	 public Student2(String name, int age) {	//생성자 오버로딩
		 this.name = name;
		 this.age = age;
	 }

	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age) {	//age Setting
		if(age < 0 || age > 100) {
			System.out.println("나이의 값이 적절치 않습니다.");
			this.age = 0;
			return;
		}
		this.age = age;
	}
	 
 }

public class Ex01_private
{

	public static void main(String[] args)
	{
		Student1 s1 = new Student1();
		s1.name = "홍길동";
		s1.age = 20;
		System.out.printf("%s의 나이는 %d입니다.%n", s1.name, s1.age);
		
		//Student2 안에는 private이 있으니 우회해야 한다.
		Student2 s2 = new Student2("구미호", 30);
		s2.name = "인절미";	//name은 public이니 수정 가능
		s2.setAge(20);		//private인 age는 setter, getter 이용해서 접근하기
		System.out.println(s2.name + "의 나이는 " +s2.getAge() + "살");
		

	}

}

/* 접근제한자(AccessModifier) **굉장히 중요!
 * 1. public : 외부 클래스 어디에서나 접근 가능
 * 2. protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근 가능
 * 3. (아무것도 표시하지 않음) default : 같은 패키지에서만 접근 가능
 * 4. private : 같은 클래스 내부에서만 접근 가능
 * 
 * private를 적용하면 클래스 외부에서 클래스 내부로의 변수와 메서드에 대한 접근 제한
 * ==> 정보 은닉화 (information hiding)
 * 변수에 값을 대입하는 메서드 => setter, 값을 가져오는 메서드 => getter
 *
 * getter, setter 사용하는 이유[꼭 사용하지 않아도 된다.] -> private한 변수에 접근 가능
 * - 값 대입 시 부적절한 값의 대입을 막기 위해 사용
 * - 허락되지 않은 데이터 접근을 방지하기 위해 사용
 * 
 * 오른쪽 마우스 -> Source -> Generate Getter and Setter -> 체크 후 -> Select Getters 또는 Select Setters -> Generate
 * 
 * */