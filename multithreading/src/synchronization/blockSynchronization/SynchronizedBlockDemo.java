package synchronization.blockSynchronization;



public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        WishingMachine vm = new WishingMachine();
        WishingThread1 t1= new WishingThread1(vm, "Dhoni");
        WishingThread2 t2 = new WishingThread2(vm, "Virat");
        t1.start();
        t2.start();
    }


}
