import java.util.ArrayList;

//class Student{
//    String name;
//    String id;
//    public Student(){
//
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", id='" + id + '\'' +
//                '}';
//    }
//}
public class MultiCatchBlock {
//    public static List<Student> students = new ArrayList<>();
public void display(){
    try{
        int arr[] = {2,5,7};
        System.out.println(arr[5]);
        int a = 11/0;
    }catch (ArrayIndexOutOfBoundsException aie){
        aie.getMessage();
    }catch (ArithmeticException ae){
        ae.getMessage();
    }
    finally{
        System.out.println("this is finally block");
    }


}

    public static void main(String[] args) {
        MultiCatchBlock mcb = new MultiCatchBlock();
//        mcb.display();
    }
}
