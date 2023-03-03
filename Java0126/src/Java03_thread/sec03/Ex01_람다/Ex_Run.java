package Java03_thread.sec03.Ex01_람다;

public class Ex_Run
{

	public static void main(String[] args)
	{
		//thread를 사용했기 때문에 2개의 동작을 동시에 시작한다. 각자 일이 끝나면 각자 끝난다.
		Runnable task1 = () -> {
			try {
				for(int i = 1; i < 20; i += 2) {
					System.out.println("20미만 짝수 출력 : " + i);
					Thread.sleep(1000);
				}
			}
			catch(Exception e){}
		};
		
		Runnable task2 = () -> {
			try {
				for(int i = 1; i < 10; i += 2) {
					System.out.println("10미만 짝수 출력 : " + i);
					Thread.sleep(1000);
				}
			}
			catch(Exception e){}
		};
		
		Thread t1 = new Thread(task1);
		t1.start();
		
		Thread t2 = new Thread(task2);
		t2.start();
		
		String name = Thread.currentThread().getName();
		System.out.println("thread : " + name);
	}

}
