package java06.sec16.quiz;

public class Ex01_Emp
{
	private String id;		//사원번호
	private String name;	//사원 이름
	private int baseSalary;	//사원의 기본급
	
	public void setName(String name) {	//사원의 이름 변경
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBaseSalary(int base) {
		this.baseSalary = base;
	}
	
	public int getBaseSalary() {
		return this.baseSalary;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public double getSalary(double bonus) {
		return this.baseSalary + this.baseSalary * bonus;
	}
	
	public String toString() {
		return this.name + "(" + this.id + ")" + "사원의 기본급은 " + this.baseSalary + "원 입니다.";
	}
}
