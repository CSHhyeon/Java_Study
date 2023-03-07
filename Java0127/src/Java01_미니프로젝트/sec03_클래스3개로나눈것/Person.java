package Java01_미니프로젝트.sec03_클래스3개로나눈것;

public class Person
{
	private String name;
	private String number;
	private String email;

	Person(){}
	
	Person(String name, String number, String email){
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}
