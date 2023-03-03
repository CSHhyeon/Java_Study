package Java02_제너릭.sec01.generic_ex;

public class Java03_GeneciAgency
{
	public static void main(String[] args)
	{
		Java03_HomeAgency homeagency = new Java03_HomeAgency();
		Java03_Home home = homeagency.rent();
		home.turnOnLight();
		
		Java03_CarAgency caragency = new Java03_CarAgency();
		Java03_Car car = caragency.rent();
		car.run();
	}
}
