package synchronization.synchronization_without_thread_communication;

public class MainThreadDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Raina");
        t.start();
        t2.start();
    }

}
