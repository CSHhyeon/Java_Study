package java08.sec03;

public class RemoteControlExample {
	public static void main(String[] args) {
		//pubilc static final int라서 RemoteControl.MAX_VOLUME이 가능한 것! 직접 접근이 가능!!
		 System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
		 System.out.println("리모콘 최저 볼륨: " + RemoteControl.MIN_VOLUME);
	}
}