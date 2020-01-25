import java.util.Arrays;
import java.util.stream.IntStream;

public class CountingArray {

    private static int sum(int [] array){
        IntStream stream = Arrays.stream(array);
        int sum = stream.sum();
        return sum;
    }
    public static void main(String args[]){
        int array[] ={1,2,3,4,5};
        System.out.println(sum(array));
    }
}
