package thread_creation;
class Thread1 extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            Thread.yield();
            System.out.println("Thread 1: "+i);
        }
    }
}
public class ThreadYieldDemo {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread t2 = new Thread(()->{
            for(int i=0; i<15; i++){
                System.out.println("Thread 2: " +i);
            }
        });
        t1.start();

//        t2.setPriority(10);
        t2.start();


        for(int j=0; j<15; j++){
            System.out.println("Main Thread: "+j);
        }

    }
}
