package java06.sec16.quiz;

public class Ex01_main
{

	public static void main(String[] args)
	{
		// 문제를 읽고 Emp 클래스를 신규 작성하라.
		Ex01_Emp emp = new Ex01_Emp();
		
		emp.setName("홍길동");
		emp.setId("12345");
		emp.setBaseSalary(50000);
		System.out.println(emp.toString());
		System.out.println("봉급 = " + emp.getSalary(30));
	}

}
