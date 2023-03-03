package Java02_제너릭.sec01.generic_ex;

public class Java03_HomeAgency implements Java03_Rentable<Java03_Home>
{
	public Java03_Home rent() {
		return new Java03_Home();
	}
}
