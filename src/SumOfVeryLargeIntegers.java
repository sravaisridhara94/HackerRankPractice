import java.util.Arrays;
import java.util.stream.LongStream;

public class SumOfVeryLargeIntegers {

    private static long sum(long [] arr){
        LongStream stream = Arrays.stream(arr);
        return stream.sum();
    }
    public static void main(String args[])
    {
        long arr[] = {1000000001,1000000002,1000000003,1000000004,1000000005};
        System.out.println(sum(arr));
    }
}
