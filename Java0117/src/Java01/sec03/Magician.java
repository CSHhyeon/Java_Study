package Java01.sec03;

public class Magician extends Commoner {

		
	public Magician(String name) {
		super(name);
		
	} 
	
	public void hunt() {
		//현재 hp값에서 사냥할때마다 2씩 체력이 깍이도록 기술
		if(this.getHp() < 2) System.out.println("체력이 모자라 사냥 할 수 없습니다.");
		else {
			System.out.println("마법사가 사냥을 시작합니다.");
			this.setHp(this.getHp() - 2);
			//현재exp값에서 사냥할때마다 10씩 경험치가 증가하도록 기술
			this.setExp(getExp() + 10);	
		}
	}
	
	
	 public void fireball() {
		 // 화염구를 던질때마다 mp는 -3만큼 감소
		 if(this.getMp() < 3) System.out.println("mp가 모자라 화염구를 던질 수 없습니다.");
		 else {
			 System.out.println("마법사가 화염구를 던집니다.");
			 this.setMp(getMp() - 3);
			 // 화염구를 던지고 exp 20 증가 
			 this.setExp(getExp() + 20); 
		 }
	 }
	
	public void heal() {
		// 마나가 (mp) -2만큼 감소
		 if(this.getMp() < 2) System.out.println("mp가 모자라 힐을 사용할 수 없습니다.");
		 else {
			 System.out.println("마법사가 힐을 사용했습니다");
			 this.setMp(getMp() - 2);
			//  체력 Hp 10 회복  
			 this.setHp(getHp() + 10);
		 }
	}
	
	public void getInfo() {
		//현재 체력, 현재 마나, 현재 레벨 현재 경험치 현재 유저명 출력
		System.out.println("현재 체력 : " + this.getHp());
		System.out.println("현재 마나 : " + this.getMp());
		System.out.println("현재 레벨 : " + this.getLv());
		System.out.println("현재 경험치 : " + this.getExp());
		System.out.println("현재 유저명 : " + this.getName());
	}
}
