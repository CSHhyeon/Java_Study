package Java01_객체;

public class Ex01_Samsung
{
	String color;
	int channel;
	int volume;
	
	void colorChange(String color) {
		this.color = color;
	}
	
	void channelUp() {
		++channel;
		System.out.println("channelup");
	}
	
	void channelDown() {
		--channel;
		System.out.println("channeldown");
	}
	
	void infoPrint() {
		System.out.println("TV의 현재 상태정보입니다.");
		System.out.println("channel : " + this.channel);
		System.out.println("color : " + this.color);
		System.out.println("volume : " + this.volume);
	}
}
