package java06.sec16.quiz;

public class Prob1 {
	
	public static void main(String[] args) {
		
		Ex01_Emp emp = new Ex01_Emp();
		emp.setId("12345");
		emp.setName("홍길동");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "봉급 = " + emp.getSalary( 30 ) );
		
	}

}
