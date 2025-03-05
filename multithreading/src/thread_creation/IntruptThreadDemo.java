package thread_creation;

class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Child thread : "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                System.out.println("Thread got interrupted");
            }
        }
    }
}

class ThreadToBeInterrupedIn100Years extends Thread{
    public void run(){
        for(int i =10; i <= 1000; i++){
            System.out.println("The Child Thread : "+i);
        }
        for(int j =1; j <= 10; j++ ){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                System.out.println("The child thread got interrupted");
            }
        }
    }
}
public class IntruptThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        ThreadToBeInterrupedIn100Years threadToBeInterrupedIn100Years  = new ThreadToBeInterrupedIn100Years();

        t.start();
        threadToBeInterrupedIn100Years.start();
        t.interrupt();
        threadToBeInterrupedIn100Years.interrupt();
        System.out.println("End of main Thread");
    }
}
