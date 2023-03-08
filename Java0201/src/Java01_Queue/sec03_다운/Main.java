package Java01_Queue.sec03_다운;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int N = sc.nextInt();

        for(int i = 0; i<N; i++) {
            char menu = sc.next().charAt(0);
            switch (menu) {
                case 'i':
                    int num = sc.nextInt();
                    queue.offer(num);
                    break;
                case 'o':
                    if (queue.isEmpty())
                        System.out.println("empty");
                    else {
                        System.out.println(queue.peek());
                        queue.poll();
                    }
                    break;
                case 'c':
                    System.out.println(queue.size());
                    break;
            }
        }
    }
}