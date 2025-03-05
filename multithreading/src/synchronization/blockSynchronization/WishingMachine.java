package synchronization.blockSynchronization;

import java.time.LocalDateTime;

public class WishingMachine {

    public void displayWieshingMsgs(String name) {
        System.out.println("Hii, Welcome to India");
//        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Today is the Date:" + LocalDateTime.now());
        System.out.println("Team India Has won champion Trophy. So we are wishing team India in our own way");

        synchronized (this) {
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
