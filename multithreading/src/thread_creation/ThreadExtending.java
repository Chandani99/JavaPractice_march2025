package thread_creation;
class Mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread");
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadExtending {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MainThread");
        System.out.println(Thread.currentThread().getName());
    }

}
