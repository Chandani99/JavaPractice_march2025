package executor_demos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableThread implements Runnable{
    String name;
    RunnableThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("This job :"+name+" is done by "+threadName);
        System.out.println("Done");
    }
}

class RunnableThread1 implements Runnable{
    int num;
    RunnableThread1(int num){
        this.num = num;
    }
    @Override
    public void run() {
        int sum  =0;
        for(int i=1; i<=num; i++){
           sum+=i;
        }
        String threadName = Thread.currentThread().getName();
        System.out.println("This job of sum is done by "+threadName);
        System.out.println(sum);
    }
}
public class ExecutorServiceWithrunnable {
    public static void main(String[] args) {
        Object[] jobs = {new RunnableThread("Eat"),
        new RunnableThread("Drink"),
        new RunnableThread("sleep"),
        new RunnableThread("Cooking"),
        new RunnableThread("Washing Dishes"),
        new RunnableThread1(10)};

        ExecutorService exeSer = Executors.newFixedThreadPool(3);
        for(Object job:jobs){
            exeSer.submit((Runnable) job);
        }
        exeSer.shutdown();
    }
}
