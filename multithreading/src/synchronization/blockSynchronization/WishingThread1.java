package synchronization.blockSynchronization;

public class WishingThread1 extends Thread{
    WishingMachine vm;
    String name;
    public WishingThread1(WishingMachine vm, String name){
        this.vm = vm;
        this.name = name;

    }

    public void run(){
        vm.displayWieshingMsgs(name);
    }
}
