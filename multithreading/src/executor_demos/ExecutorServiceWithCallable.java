package executor_demos;

import java.util.concurrent.*;

class CallableDemo implements Callable<String> {

    String name;
    public CallableDemo(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("this job "+name+ " is started by : "+threadName);

        return "done";
    }
}
public class ExecutorServiceWithCallable {

    public static void main(String[] args) {
        Callable cd2 = ()->{
            return "My callable demo2";
        };
        Object[] jobs = {new CallableDemo("Chandani"),
                new CallableDemo("Pankaj"),
                new CallableDemo("Vandana"),
                new CallableDemo("Jhagga"),
        cd2};

        ExecutorService es = Executors.newFixedThreadPool(3);
        for(Object job:jobs){
            Future<String> future = es.submit((Callable<String>) job);
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        es.shutdown();

    }
}
