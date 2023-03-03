package Java03_thread.sec02_Thread구현방식.Ex01;

class MyThread extends Thread{
	public void run() {
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
			String name = Thread.currentThread().getName();
			System.out.println("합계 : " + sum + ", thread : " + name);
		}
	}
}

public class Ex_MyThread
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		t1.start();	//start()를 호출해야지만 run()이 수행된다.
		System.out.println("thread : " + Thread.currentThread().getName());
		
		MyThread t2 = new MyThread();
		t2.start();	
		System.out.println("thread : " + Thread.currentThread().getName());
	}
}
