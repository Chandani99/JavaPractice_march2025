public class SingleTryCatchDemo {

    public void display(){
        try{
            int arr[] = {2,5,7};
            System.out.println(arr[5]);

        }catch (ArrayIndexOutOfBoundsException aie){
            aie.getMessage();
        }
        finally{
            System.out.println("this is finally block");
        }


    }

    public static void main(String[] args) {
        SingleTryCatchDemo std = new SingleTryCatchDemo();
        std.display();
    }
}
