package synchronization.synchronization_without_thread_communication;

public class MyThread extends Thread{
    Display d;
    String name;
    public MyThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
