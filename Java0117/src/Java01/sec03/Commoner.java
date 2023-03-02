package Java01.sec03;

public class Commoner {
    private int hp;  //체력
    private int mp;  //마나
    private int lv;  //레벨
    private int exp; //경험
    private String name; //유저명
    
    public Commoner(String name) {
    	this.hp =20;
    	this.mp = 10;
    	this.lv =1;
    	this.exp = 0;
    	this.name =name;
    }

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
