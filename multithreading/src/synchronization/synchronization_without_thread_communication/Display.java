package synchronization.synchronization_without_thread_communication;

public class Display {

    public synchronized void wish(String name) throws InterruptedException {
        for(int i=0; i<10; i++){
            System.out.println("Good Morning :");
            Thread.sleep(2000);
            System.out.println(name);
        }
    }
}
