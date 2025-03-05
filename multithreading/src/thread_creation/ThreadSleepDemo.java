package thread_creation;

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for(int i = 1; i<=10; i++){
                System.out.println("Slide number : "+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
        t.join();
        for(int j = 1; j<=10; j++){
            System.out.println("Main thread :" +j);
        }

    }
}
