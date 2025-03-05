import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        Integer result = num.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
        System.out.println(result);
    }
}