package java08.sec01_연습2;

abstract public class Factory
{
	private String name;
	private int openHour;	//공장가동시각 h
	private int closeHour;	//공장종료시각 h
	
	Factory(String name, int openHour, int closeHour){
		this.name = name;
		this.openHour = openHour;
		this.closeHour = closeHour;
	}
	
	public void setFactoryName(String name) {
		this.name = name;
	}
	
	public String getFactoryName() {
		return this.name;
	}
	
	/*
	public void setWorkingTime(int openHour, int closeHour) {
		this.openHour = openHour;
		this.closeHour = closeHour;
	}
	*/
	
	public int getWorkingTime() {
		return this.closeHour - this.openHour;
	}
	
	abstract int makeProducts(char skill);
}
