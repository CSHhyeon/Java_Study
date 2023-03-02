package Java01_객체;
//설계도를 하나 만들어 놓은 것
public class Ex01_TV_1
{
	//속성은 변수로
	String color;
	int channel;
	int volume;
	
	//기능은 메소드로
	void colorChange(String color) {
		this.color = color;
	}
	
	void channelUp() {
		this.channel++;
		System.out.println("channelup");
	}
	
	void channelDown() {
		this.channel--;
		System.out.println("channeldown");
	}
	
	//값 확인하는 메소드
	void infoPrint() {
		System.out.println("TV의 현재 상태정보입니다.");
		System.out.println("channel : " + this.channel);
		System.out.println("color : " + this.color);
		System.out.println("volume : " + this.volume);
	}
}
