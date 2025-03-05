package synchronization.blockSynchronization;

public class WishingThread2 extends Thread{
    WishingMachine vm;
    String name;
    public WishingThread2(WishingMachine vm, String name){
        this.vm = vm;
        this.name = name;

    }

    public void run(){
        vm.displayWieshingMsgs(name);
    }
}
