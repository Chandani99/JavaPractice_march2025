package asynchronous_computation;

import java.util.concurrent.*;

public class FutureDemoWithRunnable {
    public static void main(String[] args) {
//Example with Runnable============================================

//        Thread
        Runnable r =()->{
            for(int i =0; i<5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        };

//        Creating ExecutorService
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future future=es.submit(r);

        if(future.isDone()){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

//        End of Runnable Example =========================

    }
}
