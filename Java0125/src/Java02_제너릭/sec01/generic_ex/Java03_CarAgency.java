package Java02_제너릭.sec01.generic_ex;

public class Java03_CarAgency implements Java03_Rentable<Java03_Car>
{
	public Java03_Car rent() {
		return new Java03_Car();
	}
}
