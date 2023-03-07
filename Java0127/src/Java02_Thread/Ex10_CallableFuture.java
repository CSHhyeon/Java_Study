package Java02_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex10_CallableFuture
{
    public static void main(String[] args) 
            throws InterruptedException, ExecutionException
    {
       Callable<Integer> task1 = () -> {
    	   Thread.sleep(2000);
    	   return 2 + 3;
       };
        
       Callable<Integer> task2 = () -> {
    	   Thread.sleep(10);
    	   return 2 * 3;
       };
       
       ExecutorService pool = Executors.newFixedThreadPool(2);
       Future<Integer> f1 = pool.submit(task1);
       Future<Integer> f2 = pool.submit(task2);
       
        System.out.println("이 내용이 먼저 출력됩니다.");
        
        Integer r1 = f1.get();
        System.out.println("result: " + r1);

        Integer r2 = f2.get();
        System.out.println("result: " + r2);

        pool.shutdown();
    }
}
