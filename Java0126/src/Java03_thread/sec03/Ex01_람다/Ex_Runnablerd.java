package Java03_thread.sec03.Ex01_람다;

public class Ex_Runnablerd
{
	public static void main(String[] args)
	{
		Runnable task = () -> {
			try {
				//3000미리세크 뒤에 나간다. 잠시 휴식하는 느낌
				Thread.sleep(3000);
			}
			catch(Exception e){}
			int sum = 0;
			for(int i = 1; i < 11; i++) {
				sum += i;
				String name = Thread.currentThread().getName();
				System.out.println("합계 : " + sum + ", thread : " + name);
			}
		};
		
		Thread t = new Thread(task);
		t.start();
		String name = Thread.currentThread().getName();
		System.out.println("thread : " + name);
	}
}
