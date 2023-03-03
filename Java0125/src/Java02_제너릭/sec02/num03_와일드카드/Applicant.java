package Java02_제너릭.sec02.num03_와일드카드;

public class Applicant<T>
{
	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind;
	}

}
