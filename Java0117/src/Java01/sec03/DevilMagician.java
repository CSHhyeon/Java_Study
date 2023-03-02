package Java01.sec03;

public class DevilMagician extends Magician
{
	public String animal;
	
	public DevilMagician(String name)
	{
		super(name);
	}
	
	public void hunt_child() {
		System.out.println("마법사가 사냥을 시작합니다.");
		
		if(this.getHp() < 3) System.out.println("체력이 모자랍니다.");
		else {
			this.setHp(this.getHp() - 3);
			this.setExp(getExp() + 15);	
		}
	}
	
	public void hunt() {
		if(animal.equals("초식동물")) super.hunt();
		else this.hunt_child();
	}
	
	public void fireball() {
		 if(this.getHp() < 15) System.out.println("HP가 모자라 화염볼을 던질 수 없습니다.");
		 else {
			 if(this.getMp() < 3) {
				 System.out.println("MP가 모자라 화염볼을 던질 수 없습니다.");
			 }
			 else {
				 System.out.println("마법사가 화염구를 던집니다.");
				 this.setMp(getMp() - 3);
				 this.setExp(getExp() + 20); 
			 }
		 }
	 }
	
	public void heal() {
		 System.out.println("마법사가 힐을 사용했습니다");
		// 마나가 (mp) -2만큼 감소
		 if(this.getMp() < 2) System.out.println("mp가 모자랍니다.");
		 else {
			 this.setMp(getMp() - 2);
			 if(this.getHp() >= 0 && this.getHp() <= 10) this.setHp(getHp() + 5);
			 else if(this.getHp() >= 11 && this.getHp() <= 19) this.setHp(getHp() + 10);
			 else if(this.getHp() >= 20 && this.getHp() <= 29) this.setHp(getHp() + 15);
			 else if(this.getHp() >= 30) this.setHp(getHp() + 20);
		 }
	}
	
	public void getInfo() {
		this.hunt();
		this.fireball();
		this.heal();
		
		super.getInfo();
	}
}
