package Java02_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//스레드 풀 : 제한된 개수의 스레드를 JVM에게 관리하도록 맡기는 방식
//실행할 작업을 스레드 풀로 전달하면 JVM이 스레드 풀의 유휴 스레드 중 하나를 선택해서 스레드로 실행시킨다.
//유휴 스레드란 놀고 있는 스레드를 말한다.
public class Ex08_ThreadPool1	
{
    public static int money = 0;

    public static void main(String[] args)
    {
        Runnable task1 = () -> {     // 스레드에게 시킬 작업
            for (int i = 0; i<10000; i++)
                money++;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + money);
        };
        
        Runnable task2 = () -> {     // 스레드에게 시킬 작업
            for (int i = 0; i<10000; i++)
                money--;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + money);
        };
        
        //concurrent : 병렬처리가 되어 있는 것 -> java.util.concurrent [동시 접근성]
        //스레드 풀 객체 생성
        ExecutorService pool = Executors.newSingleThreadExecutor(); //최대 스레드 수가 1개인 스레드풀 생성
        
        //스레드 풀에 작업을 전달
        pool.submit(task1);
        
        //스레드 풀에 작업을 전달
        pool.submit(task2);
        
        System.out.println("End " + Thread.currentThread().getName());

        //스레드 풀과 그 안에 있는 스레드의 소멸
        pool.shutdown();
    }
}
