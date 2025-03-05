package asynchronous_computation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureWithRunnable {
    public static void main(String[] args) {
        System.out.println("This Is main thread starting===========");
        Runnable r =()->{
            for(int i=1; i<5; i++){
                System.out.println("This is runnable: "+i);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        CompletableFuture<Void> cf = CompletableFuture.runAsync(r);

        cf.join();

        System.out.println("This is main Thread end");
    }
}
