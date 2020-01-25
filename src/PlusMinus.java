import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlusMinus {
    private static void solution(int[] arr){
        int pos=0, neg=0, neu=0;
        for(int a: arr){
           if(a>0)
               pos++;
           if(a<0)
               neg++;
        }
        neu = arr.length - (pos+neg);
        String posFormat = String.format("%.6f", (double) pos / arr.length);
        System.out.println(posFormat);
        String negFormat = String.format("%.6f", (double) neg / arr.length);
        System.out.println(negFormat);
        String neuFormat = String.format("%.6f", (double) neu / arr.length);
        System.out.println(neuFormat);
    }
    public static void main(String []args) {
        int arr[] = {-4, 3, -9, 0, 4, 1};
        //solution(arr);
        Map<String, Integer> s = new HashMap<>();
        s.put("A", 1);
        s.put("A", 2);
        System.out.println(s.get("A"));
    }
}
