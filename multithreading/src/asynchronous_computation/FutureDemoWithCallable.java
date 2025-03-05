package asynchronous_computation;

import java.util.concurrent.*;
class CallableDemo implements Callable<Long>{
    int num;
    public CallableDemo(int num){
        this.num = num;
    }
    @Override
    public Long call() throws Exception {
        long fact  = 1;
        for(int i=num; i>1; i--){
            fact = fact*i;
        }
        return fact;
    }
}
public class FutureDemoWithCallable {
    public static void main(String[] args) {

        CallableDemo cd =new CallableDemo(10);
//        Start of Future using Collable Example
        System.out.println("Inside example of callable ==");

//        Callable<String> callable = ()->{
////            Thread.sleep(2000);
//            return "This is Callable therad";
//        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Long> future1 = service.submit(cd);
        if(future1.isDone()){
            try {
                System.out.println("Inside example of callable ==");
                System.out.println(future1.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
