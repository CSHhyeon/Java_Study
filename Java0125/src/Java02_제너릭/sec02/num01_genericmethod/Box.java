package Java02_제너릭.sec02.num01_genericmethod;

public class Box<T>
{
	private T t;
	
	public T get() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}
