package synchronization;


import java.time.LocalDateTime;

class WishingMachine {

    public void displayWieshingMsgs(String name) {
        System.out.println("Hii, Welcome to India");
//        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Today is the Date:" + LocalDateTime.now());
        System.out.println("Team India Has won champion Trophy. So we are wishing team India in our own way");

        synchronized (WishingMachine.class) {
            for (int i = 1; i < +10; i++) {
                System.out.println("Congratulations : ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }

        }
    }
}

class WishingThread1 extends Thread{
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


public class ClassLabelLock {

    public static void main(String[] args) {
       WishingMachine vm = new WishingMachine();
       WishingMachine vm2 =new WishingMachine();
        WishingThread1 t1= new WishingThread1(vm, "Dhoni");
        WishingThread1 t2 = new WishingThread1(vm2, "Virat");
        t1.start();
        t2.start();
    }
}
