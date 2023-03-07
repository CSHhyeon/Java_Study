package Java02_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex09_ThreadPool2
{
    public static void main(String[] args)
    {
        Runnable task1 = () -> {
            String name = Thread.currentThread().getName();
            try 
            {
                Thread.sleep(5000);
            }
            catch (Exception e) { }
            System.out.println(name + ": 5초 후 실행");
        };
        
        Runnable task2 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": 바로 실행");
        };
               
        Runnable task3 = () -> {
            String name = Thread.currentThread().getName();
            try {
                Thread.sleep(2000);
            }
            catch (Exception e) { }
            System.out.println(name + ": 2초 후 실행");
        };
               
        // 스레드 풀에서 수행될 수 있는 스레드의 총량을 제한
        ExecutorService pool = Executors.newFixedThreadPool(2);	//실행할 스레드의 수 제한 -> 2개 먼저 수행 후 할당 받으라는 의미
        pool.submit(task1);
        pool.submit(task2);
        pool.submit(task3);
        
        pool.shutdown();
        
        //1 넣으면 스레드가 하나라서 5초 후 진행 출력 후 바로 실행 후 2초 후 실행이 뜬다. 순서대로! -> 5초, 6초, 6초 뒤 출력됨
        //2 넣으면 두 개의 스레드가 진행되어 1번 스레드에서 5초후 실행이 진행되는 동안 바로 실행 과 2초 후 실행이 순서대로 진행된다. -> 1초, 3초, 5초 뒤 출력됨 
        //3 넣으면 세 개의 스레드가 진행되어 3개의 task가 각각 스레드에서 동시에 진행된다. 그래서 1, 2, 5초 뒤에 하나씩 출력된다.

    }
}
