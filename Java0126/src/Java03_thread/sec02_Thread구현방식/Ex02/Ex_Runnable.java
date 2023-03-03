package Java03_thread.sec02_Thread구현방식.Ex02;

class MyThread implements Runnable{
	@Override
	public void run()
	{
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
			String name = Thread.currentThread().getName();
			System.out.println("합계 : " + sum + ", thread : " + name);
		}
	}
}

public class Ex_Runnable
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new MyThread());
		t1.start();
		System.out.println("thread : " + Thread.currentThread().getName());
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		System.out.println("thread : " + Thread.currentThread().getName());
	}
}
