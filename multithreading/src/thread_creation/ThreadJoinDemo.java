package thread_creation;

class VanueFixing extends Thread{
    public void run(){
        for(int i=1; i<=15; i++){
            System.out.println("Thread is trying to fix vanue : "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CardPrinting extends Thread{
    public void run(){
        VanueFixing vf = new VanueFixing();
        try {
            vf.start();
            vf.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int j= 1; j <=20; j++){
            System.out.println("Thread is printing card : " +j );
        }
    }
}

class CardDistributing extends Thread{
    public void run()  {
        CardPrinting cp = new CardPrinting();
        try {
            cp.start();
            cp.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Card is distributed");
    }
}


public class ThreadJoinDemo {

    public static void main(String[] args) {
//        VanueFixing vf = new VanueFixing();
//        CardPrinting cp = new CardPrinting();
        CardDistributing cd = new CardDistributing();
//
//        vf.start();
//        cp.start();
        cd.start();
        try {
            cd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("all tasks done successfully");
    }
}
