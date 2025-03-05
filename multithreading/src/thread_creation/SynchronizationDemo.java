package thread_creation;

class Printer{
    static boolean isOdd = true;

    public synchronized void printEven(int n){
        if(n%2 != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(n);
        isOdd = true;
        notify();

    }

    public synchronized void printOdd(int n){
        if(n%2 == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(n);
        isOdd = false;
        notify();

    }
}

class OddPrinterThread extends Thread{
    Printer printer;
    int num;

    public OddPrinterThread(Printer p, int num){
        this.printer = p;
        this.num = num;
    }

    public void run(){

        for(int i= 1; i<=num; i++){
            printer.printOdd(i);
        }
    }
}
class EvenPrinterThread extends Thread{
    Printer printer;
    int num;

    public EvenPrinterThread(Printer p, int num){
        this.printer = p;
        this.num = num;
    }

    public void run(){
        for(int i= 1; i<=num; i++){
            printer.printEven(i);
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Printer p  = new Printer();
        OddPrinterThread oddPrinterThread = new OddPrinterThread(p, 20);
        EvenPrinterThread evenPrinterThread = new EvenPrinterThread(p, 20);
//        oddPrinterThread.setPriority(10);
        oddPrinterThread.start();
        evenPrinterThread.start();
    }
}
